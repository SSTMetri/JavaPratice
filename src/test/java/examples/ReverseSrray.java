package examples;

public class ReverseSrray 
{
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		reverse(a,a.length);
		swapping(a,a.length);
	}
	static void reverse(int  a[],int n) {
		int[] b=new int[n];
		int j=n;
        for(int i=0;i<n;i++) {
        	b[j-1]=a[i];
        	j=j-1;
        }
        System.out.println("Reversed array is:\n");
        for(int k=0;k<n;k++) {
        	System.out.print(b[k]+" ");
        }
		
	}
	static void swapping(int a[],int n) {
		int i,k,t;
		for(i=0;i<n/2;i++) {
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		System.out.println("Reversed array is:\n");
		for(k=0;k<n;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
