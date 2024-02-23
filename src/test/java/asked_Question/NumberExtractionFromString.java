package asked_Question;

public class NumberExtractionFromString 
{
	public static void main(String[] args) {
		String string="Learning Java $ ^ 12345678";
		String[] str=string.split(" ");
		for(String s:str) {
			try {
				int num=Integer.parseInt(s);
				System.out.println(num);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
