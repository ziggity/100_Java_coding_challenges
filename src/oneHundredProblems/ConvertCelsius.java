package oneHundredProblems;
/*
 * The algorithm to convert from Celsius to Fahrenheit is the temperature in Celsius times 9/5, plus 32.

You are given a variable celsius representing a temperature in Celsius. Use the variable fahrenheit already defined and assign it the Fahrenheit temperature equivalent to the given Celsius temperature. Use the algorithm mentioned above to help convert the Celsius temperature to Fahrenheit.

Don't worry too much about the function and return statements as they will be covered in future challenges. For now, only use operators that you have already learned.

Example

celsiusToFahrenheit(-30) returns -22;
celsiusToFahrenheit(-10) returns 14;
celsiusToFahrenheit(0) returns 32;
 */
public class ConvertCelsius {

	public static void main(String[] args) {
		int hot = 35;
		int cold = 0;
		int freeze = -35;
		System.out.println(convertToF(hot));
		System.out.println(convertToF(cold));
		System.out.println(convertToF(freeze));
	}

	private static int convertToF(int celsius) {
		  return celsius * 9/5 +32;		
	}

}
