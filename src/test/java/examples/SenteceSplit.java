package examples;

public class SenteceSplit 
{
	public static void main(String[] args) {
		String sent="Hello world there";
		String[] str=sent.split("\\s+");
		for(String s:str) {
			System.out.println(s);
			
		}
	}
//	private String function(float i, int f) {
//		return ("ABC");
//	}
//	private String function(double i, double f) {
//		return ("PQR");
//	}
//	public static void main(String[] args)
//	{
//		Main obj = new Main();
////		System.out.println(obj.function(1.2, 20));
//	}

}
