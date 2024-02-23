package examples;

public class RecplaceStringToUppderCase 
{
	public static void main(String[] args) {
//		String str="JavaCodes";
//		String s=str.toLowerCase();
//		
//		char s1=str.charAt(0);
		
		int a=10,b=5;
		int c=a>b ? a:b;
		System.out.println(c);
        
        String[] str={"AA","atr1","Java","Programming","Python","AB"};
        String t="";
        for(int i=0;i<str.length;i++) 
        {
            for(int j=i+1;j<str.length;j++) 
            {
                if(str[i].compareTo(str[j])<1) 
                {
                	t=str[i];
                	str[i]=str[j];
                	str[j]=t;
                }
            }
        }

        for(int i=0;i<str.length;i++) {
        	System.out.print(str[i]+" , ");
        }
	}
	

}
