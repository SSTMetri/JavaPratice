package examples_all;

class Super_C
{
	int x=10;
	public Super_C()
	{
		System.out.println("Super_C constructor & variable is "+x);
	}
	int a=10;
	public void method()
	{
		System.out.println("Print a "+a);
	}
} 
class Sub_C extends Super_C
{
	int x=15;
	public Sub_C()
	{
		System.out.println("Sub_C constructor & variable is "+x);
	}
	int a=15;
	public void method()
	{
		System.out.println("Modified a "+a);
	}
}

public class SuperClass 
{
	public static void main(String[] args) 
	{
		Sub_C v=new Sub_C();
		v.method();
		
		
	}

}
