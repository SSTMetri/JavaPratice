package examples;

import encapsulation.Public_AccessSpecifier;

public class Program3 extends Public_AccessSpecifier
{
	public static void main(String[] args) {
		Public_AccessSpecifier obj=new Public_AccessSpecifier();
		System.out.println(obj.a);
		obj.test();
		
		Program3 p1=new Program3();
		System.out.println(p1.b);
		p1.run();
	}

}
