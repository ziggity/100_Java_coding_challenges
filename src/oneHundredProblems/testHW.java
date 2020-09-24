package oneHundredProblems;



public class testHW{

	public static void main(String[] args) {
		
	
	//Item price
			int salePrice = 10;
			int itemPrice = 50;
			
	//Amount of money in wallet
			int myMoney= 53;
			int friendMoney= 127;
			
	//Number of friends
			int friendsWork = 20;
			int friendsSchool = 20;
			
	//Age in years (as a whole number)
			int currentAge = 40;
			int previousAge = 20;
			
	//First name
			String firstName ="Naida";
			String friendFirstname="Sally";
			
	//Last name
			String lastName = "Chang";
			String friendLastname = "Smith";	
			
	//Middle initial
			char middleInitial = 'C';		
			char friendMiddleinitial ='J';	
			
	//New amount of money in my wallet after buying the item
			int moneyNow = myMoney - salePrice;
			System.out.println(moneyNow);

	//New amount of money in friends wallet after buying the item		
			int friendsWallet = friendMoney - itemPrice;
			System.out.println(friendsWallet);
			
	//Number of friends you’ve made each year based on your age variable and your number of friends variable
			int friends = currentAge/friendsSchool;
			System.out.println(friends);
			
	//Number of friends you’ve made each year based on your age variable and your number of friends variable
			int newFriends = previousAge/friendsWork;
			System.out.println(newFriends);
			
	//Full name based on first name, middle initial, and last name
			String fullName = firstName + " "+ middleInitial +" "+ lastName;
			System.out.println(fullName);
			
	//Full name of friend based on first name, middle initial and last name
			String friendFullname = friendFirstname +" "+ friendMiddleinitial +" "+ friendLastname;
			System.out.println(friendFullname);
					
					
					
					
					
					
					
					
					

		}

	}