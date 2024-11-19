package calculator.utils;

import java.util.Arrays;

public class InputParser {
    public static int[] basicSeparator(String input) {
        String regex = "[:,]";
        String[] inputSep = input.split(regex);
        int[] inputInt = new int[inputSep.length];
        if (InputValidator.isNone(input)) {
            inputInt[0] = 0;
        }
        else if (InputValidator.isBasicSeparator(input) && InputValidator.isPositive(inputSep)) {
            for (int i = 0; i < inputInt.length; i++) {
                if (InputValidator.isNoneInput(inputSep)) {
                    inputInt[i] = 0;
                } else inputInt[i] = Integer.parseInt(inputSep[i]);
            }
        }
        return inputInt;
    }

    public static int[] specialSeparator(String input) {
        String replaceInput = input.replaceAll("[//\\\\n]", "");
        String[] replaceSpr = replaceInput.split("");
        String regex = "[:,"+ replaceSpr[0] + "]";
        String inputSep = replaceInput.replaceAll(regex, "");
        String[] inputSeparator = inputSep.split("");
        int[] inputInt = new int[inputSep.length()];
        if (InputValidator.isNone(input)) {
            inputInt[0] = 0;
        }
        else if (InputValidator.isSpecialSeparator(input) && InputValidator.isPositive(inputSeparator)) {
            for (int i = 0; i < inputSeparator.length; i++) {
                if (InputValidator.isNoneInput(inputSeparator)) {
                    inputInt[i] = 0;
                } else inputInt[i] = Integer.parseInt(inputSeparator[i]);
            }
        }
        return inputInt;
    }
}
