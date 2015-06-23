public class ExceptionCentral 
{	
	public static void main(String[] args) 
	{		
		ExceptionCentral exceptionsCentral = new ExceptionCentral();
		try	
		{
			exceptionsCentral.Divide(48, 0);
		}
		catch(Exception ex)
		{
			/*print this message. the exception is also being caught at this point*/
			System.out.println("I can not complete this problem"); 
			ex.printStackTrace(); 
		}
		try		/*nullpointer exception*/
		{
			exceptionsCentral.PrintSomething(null);
			String a = null;
			System.out.println(a.toString());

		}
		catch(ArrayIndexOutOfBoundsException ex3)
		{
			System.out.println("Array did not have a 5th slot");
			ex3.printStackTrace();
		}

		int[] Array3 = {}; /*outofbound exception*/
		exceptionsCentral.PrintArrayValues(Array3);
	}
	int Divide(int number, int divisor) throws ArithmeticException
	{
		int quotient = number/divisor;
		System.out.println(quotient);
		return quotient;
	}
	void PrintSomething(String someString) throws NullPointerException
	{
		String smallString = someString.toLowerCase();
		System.out.println(smallString);
	}

	void printArrayValue8 (String[] sArray) throws ArrayIndexOutOfBoundsException
	{
		System.out.println(sArray[8]);
	}

	void PrintArrayValues(int[] array)
	{
		try
		{
			for (int i = 2; i < 24; i--)
			{
				System.out.println(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException indexException)
		{
			System.out.println("try an array with 24");
			indexException.printStackTrace();
		}
	}
}