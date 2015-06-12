public class Main 
{

	public static void main(String[] args) 
	{
		//Creating an object person name Deneshia Walton//
		Person DeneshiaWalton = new Person("Deneshia Walton", 20, "4042876043", "4365 Colony Square Stone Mountain, Georgia 30083"); 
		System.out.println("My name is: " + DeneshiaWalton.GetPersonsName() + "."); 
		System.out.println("My age is: " + DeneshiaWalton.GetPersonsAge() + ".");
		System.out.println("My phone number is: " + DeneshiaWalton.GetPersonsPhoneNumber() + ".");
		System.out.println("My address is: " + DeneshiaWalton.GetPersonsAddress() + ".");
		
		DeneshiaWalton.GrowsOlder();
		System.out.println("On January 18, 2016 I am turning " + DeneshiaWalton.GetPersonsAge() + ".");
		
	}
}
