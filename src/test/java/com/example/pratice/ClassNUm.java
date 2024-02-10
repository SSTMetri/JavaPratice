package com.example.pratice;

class MyFirstClass
{
static void num () {
	System.out.println("XYZ");
}
static int y=11;
MyFirstClass(){
	System.out.println("MyFirstClass");
}
}

public class ClassNUm 
{
	int a=10;
	static int b=20;
	public static void main(String[] args) {
		byte n1=10;
		byte n2=-120;
//		byte sum=n1+n2; //(-128 to 127)
		
		ClassNUm t=new ClassNUm();
		t.a=100;
		t.b=200;
		
		ClassNUm x=new ClassNUm();
		System.out.println("t.a="+t.a+"t.b="+t.b);
		System.out.println("x.a="+x.a+"x.b="+x.b);
		
		MyFirstClass my=new MyFirstClass();
		System.out.println(my.y);
		my.num();
		MyFirstClass.num();
	}

}
