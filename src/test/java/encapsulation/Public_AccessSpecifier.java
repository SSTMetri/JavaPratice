package encapsulation;

public class Public_AccessSpecifier 
{
	public int a=28;
	public void test()
	{
		System.out.println("test mathos..");
	}
	
	protected float b=52.6f;
	protected void run()
	{
		System.out.println("Run method for protected method");
		System.out.println("Here objects will be visible within the class, outside class of same APAKE.");
		System.out.println("Outside the pakage objects are visible in their SUB-CLASSES");
		System.out.println("And we should create the object of the subclass");
		System.out.println("to access the members");
	}
}
