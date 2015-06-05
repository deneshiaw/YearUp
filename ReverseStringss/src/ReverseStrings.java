import java.util.Scanner;
public class ReverseStrings {
	
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		System.out.println("What word do you want to reverse?");
		String newString = scanner.nextLine();
		
		ReverseInPlace(newString);
		ReverseOutOfPlace(newString);
		
		scanner.close();
		
	}
	
	public static String ReverseInPlace(String originalString)
	{	
		String reversedString = null;
		char[] originalStringCharacters = originalString.toCharArray();
		if (originalString != null)
		{
			for (int i = 0, j = originalStringCharacters.length -1; i < originalStringCharacters.length/2; i++, j--)
			{
				char temp = originalStringCharacters[j]; 
				originalStringCharacters[j] = originalStringCharacters[i];
				originalStringCharacters[i] = temp;
			}	
			reversedString = new String(originalStringCharacters);
			System.out.println("Using the reverse method, the word is: " + reversedString + ".");
		}
		return reversedString;
	}
	
	public static String ReverseOutOfPlace(String originalString)
	{
		String ReversedStringOutOfPlace = null;

		if (originalString != null);
		{
			char[] array1 = originalString.toCharArray();
			char[] array2 = new char[array1.length];
			
			for (int i = array1.length -1, j = array2[0]; i >= 0; i--, j++)
			{
				array2[j] = array1[i];
			}
			ReversedStringOutOfPlace = new String(array2);
			System.out.println("Using the out of place method, the word is:" + ReversedStringOutOfPlace + ".");
		}
		return ReversedStringOutOfPlace;
	}
}