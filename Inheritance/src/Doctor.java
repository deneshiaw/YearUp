public class Doctor extends Worker 
{
	public Doctor()
	{
		m_work = "I saved someone's life today";
	}
	
	public static void main(String[] args)
	{
		Worker Surgeon = new Worker();
		Surgeon.DoWork();
		
		Surgeon = new Doctor();
		Surgeon.DoWork();
	}
}