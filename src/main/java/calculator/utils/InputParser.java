package calculator.utils;

import java.util.Arrays;

public class InputParser {
    public int[] basicSeparator(String input) {
        String regex = "[:,]";
        String[] inputSep = input.split(regex);
        int[] inputInt = new int[inputSep.length];
        if (InputValidator.isNone(input) && InputValidator.isNoneInput(inputSep) && InputValidator.isBasicSeparator(input)) {
            inputInt = Arrays.stream(inputSep).toList().stream().mapToInt(Integer::parseInt).toArray();
        }
        return inputInt;
    }

    public int[] specialSeparator(String input) {
        String replaceInput = input.replaceAll("[////\\n]", "");
        String[] replaceSpr = replaceInput.split("");
        String regex = "[:,"+ replaceSpr[0] + "]";
        String inputSep = input.replaceAll(regex, "");
        int[] inputInt = new int[inputSep.length()];
        if (InputValidator.isNone(input) && InputValidator.isNoneInput(inputSep.split("")) && InputValidator.isSpecialSeparator(input)) {
            String[] inputSeperator = inputSep.split("");
            for (int i = 0; i < inputSeperator.length; i++) {
                inputInt[i] = Integer.parseInt(inputSeperator[i]);
            }
        }
        return inputInt;
    }
}
