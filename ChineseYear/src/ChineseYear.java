import java.util.Scanner;
public class ChineseYear {
	void EvaluateChineseYear(int UnknownYear) {
		int s_knownYear = 1900;
		int yearDifference = UnknownYear - s_knownYear;
		UnknownYear= yearDifference;
		int remainder = yearDifference % 12;

	}
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("What is your birth  year?: ");
	    int year = input.nextInt();
	    
	    switch (year % 12) {
	    
	      case 0: System.out.println(UnknownYear + "Rat");break;
	      case 1: System.out.println(UnknownYear + "Ox");break;
	      case 2: System.out.println("Tiger");break;
	      case 3: System.out.println("Rabbit");break;
	      case 4: System.out.println("Dragon");break;
	      case 5: System.out.println("Snake");break;
	      case 6: System.out.println("Horse");break;
	      case 7: System.out.println("Sheep");break;
	      case 8: System.out.println("Monkey");break;
	      case 9: System.out.println("Rooster");break;
	      case 10: System.out.println("Dog");break;
	      case 11: System.out.println("Pig");break;
	    }
	  }
	}


