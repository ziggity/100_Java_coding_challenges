package oneHundredProblems;



public class testHW{

	public static void main(String[] args) {
		
		System.out.println(intExponent(3, 4));
		

	}
	

//intExponent(3, 4);



public static int intExponent ( int base, int exponent) {

	int answer=base;

	for(int i =0;i<=exponent;i++){

	int multiply=base;

	  multiply*=base*multiply*multiply;

	  answer=multiply;

	 
	}
	return answer;
	}
}
	

	

