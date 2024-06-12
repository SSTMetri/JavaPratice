package praticeYT_examples;

import java.util.Arrays;

public class Avg 
{
	public static void main(String[] args) {
		int[] a1= {1,2,3,4};
		int[] a2= {10,20};
		int[] c=new int[a1.length + a2.length];
		int i=0,j=0,k=0;
		while(i<c.length) {
			if(j<a1.length) {
				c[i]=a1[j];
				i++;
				j++;
			}
			if(k<a2.length) {
				c[i]=a2[k];
				i++;
				k++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
