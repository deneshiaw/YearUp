public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circleArea= CalcuateCircleArea(8);
		System.out.println("The area of the circle is:"+ circleArea);
		
		double rectangleArea= CalculateRectangleArea(4,7);
		System.out.println("The area of the rectangle is:" + rectangleArea );
		
		
	}
	
	static double CalcuateCircleArea(int radius){
	double area= 3.14*radius*radius;
	return area;
	}
	
	static double CalculateRectangleArea(int length,int breadth){
	double area= length*breadth;
	return area;
	}
}

