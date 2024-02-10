package examples_all;

public class LCM_HCF 
{
	public static void main(String[] args) 
	{
		
		int n1=6,n2=2,hcf=1;
		for(int i=1;i<=n1 && i<=n2;++i)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		
		int l=(n1*n2)/hcf;
		System.out.println("LCM "+l);
		
		
//		   int n1 = 72, n2 = 120, lcm;
		int lcm;
		// maximum number between n1 and n2 is stored in lcm
		lcm = (n1 > n2) ? n1 : n2;
		// Always true
		while(true) {
        if( lcm % n1 == 0 && lcm % n2 == 0 ) {
    	System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
		      }
        ++lcm;
        }
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
