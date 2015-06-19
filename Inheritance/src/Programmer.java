public class Programmer extends Worker
{
	public Programmer()
	{
		m_work = "I fixed a bug";
	}
	
	public static void main(String[] args) 
	{
		/*new object Louise fixing a bug*/
		Programmer Louise = new Programmer();
		Louise.DoWork();
		/*Myles is Louise, so he fixes a bug*/
		Worker Myles = Louise;
		Myles.DoWork();
	}

}