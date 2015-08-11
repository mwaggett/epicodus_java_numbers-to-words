import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;

import java.util.Map;
import java.util.HashMap;

public class Numword {
    public static void main(String[] args) {

    }

    public static Boolean checkInt (String userInput) {
        Integer input = 0;
        try {
            input = Integer.parseInt(userInput);
                if(input < 0) {
                    return false;
                }
            } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String numToWord(String userInput) {
        String wordNum;

        wordNum = onesMap(userInput);

        return wordNum;
    }

    public static String onesMap(String onesDigit) {
        HashMap<String, String> onesMap = new HashMap<String, String>();

        onesMap.put("1", "one");
        onesMap.put("2", "two");
        onesMap.put("3", "three");
        onesMap.put("4", "four");
        onesMap.put("5", "five");
        onesMap.put("6", "six");
        onesMap.put("7", "seven");
        onesMap.put("8", "eight");
        onesMap.put("9", "nine");
        onesMap.put("0", null); //figure out special case for zero

        String wordNum = onesMap.get(onesDigit);

        return wordNum;
    }

    public static String tensMap(String tensDigit) {
        HashMap<String, String> tensMap = new HashMap<String, String>();
        tensMap.put("1", "ten");
        tensMap.put("2", "twenty");
        tensMap.put("3", "thirty");
        tensMap.put("4", "forty");
        tensMap.put("5", "fifty");
        tensMap.put("6", "sixty");
        tensMap.put("7", "seventy");
        tensMap.put("8", "eighty");
        tensMap.put("9", "ninety");

        String wordNum = tensMap.get(tensDigit);

        return wordNum;
    }
}
