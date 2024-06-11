package examples;

public class ReverseOnceStr 
{
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s="Hello world",rev="";
        for(int i=s.length()-1;i>=0;i--) {
            rev=rev + s.charAt(i);
        }
        System.out.println(rev);
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++) {
            if(str[i].equalsIgnoreCase("Hello")) {
                String strAt=str[i];
                for(int j=strAt.length()-1;j>=0;j--) {
                    System.out.print(strAt.charAt(j));
                }
            } else {
            	System.out.println(" "+str[i]);
            }
        }
	}

}
