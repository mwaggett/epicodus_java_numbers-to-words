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
}
