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
		
		int i = 0;
		while(i < 10) {
		i++;
		}
		System.out.println(i);
		
		String str="abcde";
		str.trim();
		str.toUpperCase();
		str.substring(3,4);
		System.out.println(str);
		
		
		if(1 + 1 + 1 + 1 + 1 == 5){
			System.out.print(true);
			}
			else{
			System.out.print(false);
			}
	}

}
