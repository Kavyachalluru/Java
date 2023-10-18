package java_programs;
import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	    public int romanToInteger(String s) {
	        if (s == null || s.length() == 0)
	            return 0;
	        Map<Character, Integer> romanToInteger = new HashMap<>();
	        romanToInteger.put('I', 1);
	        romanToInteger.put('V', 5);
	        romanToInteger.put('X', 10);
	        romanToInteger.put('L', 50);
	        romanToInteger.put('C', 100);
	        romanToInteger.put('D', 500);
	        romanToInteger.put('M', 1000);

	        int result = romanToInteger.get(s.charAt(s.length() - 1));
	        for (int i = s.length() - 2; i >= 0; i--) {
	            if (romanToInteger.get(s.charAt(i)) >= romanToInteger.get(s.charAt(i + 1)))
	                result += romanToInteger.get(s.charAt(i));
	            else
	                result -= romanToInteger.get(s.charAt(i));
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        RomanToInt converter = new RomanToInt();
	        String romanNumeral = "IX";
	        int intValue = converter.romanToInteger(romanNumeral);
	        System.out.println("The integer value of " + romanNumeral + " is: " + intValue);
	    }
	}

