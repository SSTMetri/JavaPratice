

package examples_all;

public class StandarDeviation 
{
	public static void main(String[] args) 
	{
		double[] a= {1,5,2,8,7,5};
		double sum=0;
		for(double n:a)
		{
			sum=sum+n;
		}
		double avg=(sum/a.length);
		System.out.println(avg);
		//math.sqrt((i-avg)*(i-avg)/(length-a))
		//top=(i-avg)*(i-avg)
		double top=0;
		for(int i=0;i<a.length;i++)
		{
			top=top+(a[i]-avg)*(a[i]-avg);
		}
		System.out.println(top);
		double res1=top/(a.length-1);
		
		double stdDeviation=Math.sqrt(res1);
		System.out.println("Standar Deviation "+stdDeviation);
		
	}

}
