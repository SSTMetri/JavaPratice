package encapsulation;

public class Public_SameCLass 
{
	public static void main(String[] args) {
		Public_AccessSpecifier obj2=new Public_AccessSpecifier();
		obj2.test();
		System.out.println(obj2.a);
		
		System.out.println(obj2.b);
		obj2.run();
		
		
	}

}
