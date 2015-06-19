public class Lawyer extends Worker
{
	public Lawyer()
	{
		m_work = "I won my case today. Case closed!!";
	}
	
	public static void main(String[] args)
	{ 
		/*new object lawyer who won a case*/
		Lawyer Lyla = new Lawyer();
		Lyla.DoWork();
	}
}
