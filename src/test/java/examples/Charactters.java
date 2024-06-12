package examples;

public class Charactters 
{
	public static void main(String[] args) {
	       char chF='a',chL='z';
	        // while(chF<=chL) {
	        //     System.out.print(chF);
	        //     if(chF!=chL){
	        //         System.out.print(", ");
	        //     }
	        //     chF++;
	        // }
	        System.out.println('A' - 'a');  //-32  'A'=1 'a'=33
	        for(int i='a';i<='z';i++) {
	            char chp= (char)(i - 32);
	            System.out.print(chp+" ");
	        }
	        System.out.println();
	        String s="Hello";
	        for(int i=0;i<s.length();i++) {
	        	char upCh=s.charAt(i);
	        	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
	        		upCh=(char)(upCh -32);
	        		System.out.print(upCh);
	        	} else {
	        		System.out.print(upCh);
	        	}
	        }
	}

}
