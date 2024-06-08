package patters;

public class StraightPyramid 
{
	public static void main(String[] args) {
		
		/*
		 __*__ 
		 _***_ 
		 ***** 
		 */
		int n=3;
        int col=n+n-1;
        int col1=col+2;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n*2-1;j++) {
                if(i+j>=n+1 && j-i<=n-1) {
                   System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println(" ");

        }
        
	}

}
