package praticeYT_examples;

public class BeakNeste 
{
	public static void main(String[] args) {
		outer: for(;;) 
		{
			for(;;) 
			{
				System.out.println("inner");
				break outer;
			}
//			System.out.println("outer");
		}
	}

}
