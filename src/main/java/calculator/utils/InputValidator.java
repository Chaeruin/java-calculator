package calculator.utils;

import calculator.enums.ErrorMessage;
import java.util.Arrays;

public class InputValidator {
    public static boolean isNone(String input) {
        if (input.equals("")) {
            return true;
        }
        return false;
    }

    public static boolean isNoneInput(String[] input) {
        for (String i : input) {
            if (i.equals("") || i.equals(" ")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPositive(String[] input) {
        for (String i: input) {
            if (Integer.parseInt(i) <= 0) {
                throw new IllegalArgumentException(ErrorMessage.INVALID_NEGATIVE.getErrorMessage());
            }
        }
        return true;
    }

    public static boolean isSpecialSeparator(String input) {
        String[] inputSep = input.split("n");
        if ((inputSep.length == 0 || inputSep[0].length() == 0) || !(inputSep[0].startsWith("//") || inputSep[0].endsWith("\\"))) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_SEPARATOR.getErrorMessage());
        }
        return true;
    }

    public static boolean isBasicSeparator(String input) {
        String regex = "[:,]";
        String[] inputSep = input.split(regex);
        try {
            int[] inputInt = Arrays.stream(inputSep).toList().stream().mapToInt(Integer::parseInt).toArray();
        } catch (Exception e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_SEPARATOR.getErrorMessage());
        }
        return true;
    }
}
