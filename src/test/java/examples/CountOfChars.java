package examples;

public class CountOfChars 
{
	public static void main(String[] args) {
		String str="MyNameIs";
		char[] ch = str.toCharArray();
		int index=0,count=0;
		boolean flag=true;
		while(true) {
			try {
				char chh=str.charAt(index);
				count++;
				index++;
			} catch(Exception e) {
				flag=false;
				break;
			}
		}
		System.out.println(count);
		
		//*************************************************
		int count1=0;
		for(char c:ch) {
			count1++;
		}
		System.out.println(count1);
		
	}

}
