package calculator.service;

import calculator.utils.InputParser;
import calculator.utils.InputValidator;
import java.util.Arrays;

public class CalculatorService {

    public int[] whichSeperator(String input) {
        int[] inputInt;
        if (input.startsWith("//")) {
            inputInt = InputParser.specialSeparator(input);
        } else {
            inputInt = InputParser.basicSeparator(input);
        }
        return inputInt;
    }

    public int getSumResult(int[] inputInt) {
        return Arrays.stream(inputInt).sum();
    }
}
