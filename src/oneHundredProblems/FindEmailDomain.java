package oneHundredProblems;
/*
 * An email address such as "John.Smith@example.com" is made up of a local part ("John.Smith"), an "@" symbol, then a domain part ("example.com").

The domain name part of an email address may only consist of letters, digits, hyphens and dots. The local part, however, also allows a lot of different special characters. Here you can look at several examples of correct and incorrect email addresses.

Given a valid email address, find its domain part.

Example

For address = "prettyandsimple@example.com", the output should be findEmailDomain(address) = "example.com";

For address = "<>[]:,;@"!#$%&*+-/=?^_{}| ~.a"@example.org", the output should be findEmailDomain(address) = "example.org".

Hints

lastIndexOf()
slice()
Input/Output

[execution time limit] 5 seconds (ts)

[input] string address

Guaranteed constraints:

10 ≤ address.length ≤ 50.

[output] string

 */
public class FindEmailDomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findEmailDomain("proJavaDev@gmail.com"));
		System.out.println(findEmailDomain("proJavaDev@msn.com"));

		System.out.println(findEmailDomain("proJavaDev@yahoo.com"));

	}

	private static String findEmailDomain(String address) {
		  int lastAtIndex = address.lastIndexOf("@");

		return address.substring(lastAtIndex+1, address.length());
	}

}
