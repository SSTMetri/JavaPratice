package practice2;

public class FindOvels 
{
	public static void main(String[] args) {
		String s="testing";
		int count=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' ||
					c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U') {
				System.out.println("Ovel "+c[i]);
				count++;
			} else {
				System.out.println("Consonent "+c[i]);
			}
		} 
		System.out.println(count);
	}

}
