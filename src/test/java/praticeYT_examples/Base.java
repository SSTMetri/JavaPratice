package praticeYT_examples;

class Test {
	protected int x,y;
	
	
}

public class Base {
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.x+" "+t.y);
		
		int y,p;
		for (int x=1; x<=3; x++){
			for (y=1; y<=2; y++){
				p = x * y;
				System.out.print(p);
			}
		System.out.println( );
		}
		//12
		//24
		//36


	}

}
