package oneHundredProblems;
/*
 * The easiest way to understand the Caesar cipher is to think of cycling the position of the letters. In a Caesar cipher with a shift of 3, A becomes D, B becomes E, C becomes F, etc. When reaching the end of the alphabet it cycles around, so X becomes A, Y becomes B and Z becomes C.
 */
public class CeasersCipher {

	public static void main(String[] args) {
		String str = "ztacocatz";
		System.out.println(solve(str, 2));
	}



public static String solve(String str, int key) {
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) + key <= 122) {
			System.out.println((char)str.charAt(i) + key);
			sb.append((char)(str.charAt(i) + key));
			System.out.println(str.charAt(i));

		} else {
			sb.append((char)(96 + (str.charAt(i) + key) % 122));
			System.out.println((char)(96 + (str.charAt(i) + key) % 122));
			
		}
	}
	return sb.toString();
}

}