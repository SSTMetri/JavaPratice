package com.practice1.encapsulation;

class Private_method
{
	private int a;
	private int b;
//	private int c;
	Private_method(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public double getArea()
	{
		System.out.println("Calculate area of rectangle ");
		double r_a=(double)a*b;
		return r_a;
	}
	public int getPerimeter()
	{
		System.out.println("Rectangle perimeter");
		int peri=a*b;
		return peri;
	}
}

public class Encapsulated_Area 
{
	public static void main(String[] args) 
	{
		Private_method pt=new Private_method(5,10);
		double rect_area=pt.getArea();
		System.out.println(rect_area);
		int rect_perimeter=pt.getPerimeter();
		System.out.println(rect_perimeter);
		
	}

}
