package ugeseddel03;

import java.awt.Point;

public class Opgave36 {

	public static void main(String[] args) 
	{
		Point p1 = new Point(5,2);
		Point p2 = new Point(-3,6);
		swapPoints(p1, p2);
		System.out.println("(" + p1.x + ", " + p1.y + ")");
		System.out.println("(" + p2.x + ", " + p2.y + ")");
		
	}
	public static void swapPoints(Point Newp1, Point Newp2)
	{
		Point pT = new Point();
		pT.x = Newp1.x; 
		pT.y = Newp1.y;
		Newp1.x = Newp2.x; 
		Newp1.y = Newp2.y; 
		Newp2.x = pT.x;  
		Newp2.y = pT.y; 
	}

}
