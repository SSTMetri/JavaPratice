package encapsulation;

public class Clas_Prog 
{
	void fun(int n) {
		if (n > 1)
			fun(n - 1);
			for (int i = 0; i < n; i++) {
				System.out.println("* ");
			}
		}
	

		public static void main(String[] a) {
			Clas_Prog t = new Clas_Prog();
		t.fun(5);
		
		char str = '2';

		switch(str) {
		case '1': System.out.println("one ");
		case '2': System.out.println("two ");
		case '3': System.out.println("three ");
		}
		}

}
