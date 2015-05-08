public class Circle1
{

	String m_color = null;
	double m_radius = 6;

	Circle1 (double radius)
		{
			m_radius = radius;
			m_color = "grey";
		}
	
	Circle1 (double radius, String color)
		{
			m_radius = radius;
			m_color = color;
		}
	double CalculateArea ()
		{
			double m_area = 3.14 * m_radius * m_radius;
			return m_area;
		}
	
	void PrintColor()
		{
			System.out.println("My color is:" + m_color);
		}
	
	public static void main (String[] args)
	{
		Circle1 bigCircle = new Circle1(10);
		bigCircle.CalculateArea();
		System.out.println("Big Circle's area is: " + bigCircle.m_radius);
		bigCircle.PrintColor();

		Circle1 smallCircle = new Circle1 (5, "pink");
		smallCircle.CalculateArea();
		System.out.println("Small Circle's area is: " + smallCircle.m_radius);
		smallCircle.PrintColor();
	}
}
