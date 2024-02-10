package practice2;

class Base {
	public void s() {
		System.out.println("Priint");
	}
}

class D extends Base {
	public void s() {
		System.out.println("Print do");
	}
}

public class YoutubleDOPRINT 
{
	public static void DoPrint(Base o) {
		o.s();
	}
	public static void main(String[] args) {
		Base x=new Base();
		Base y=new D();
		 
		D z=new D();
		
		DoPrint(x);
		DoPrint(y);
		DoPrint(z);
	}

}
