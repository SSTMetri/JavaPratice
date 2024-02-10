package examples_all;

import java.util.Arrays;

class Arra
{
	@Override
	public String toString() {
		return "Arra [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

public class Array_Ex 
{
	public static void main(String[] args) 
	{
		int[][] in= {{1,2,3},{1,2,3},{1,2,3}};
		System.out.println(Arrays.toString(in));
		for(int[] row:in)
		{
			System.out.println(Arrays.toString(in));
		}
		Arra ar=new Arra();
		ar.toString();

		int[][] bar=new int[2][2];
		bar[0][0]=5;
		bar[0][1]=1;
		bar[1][0]=8;
		bar[1][1]=6;
		System.out.println("****");
		for(int[] row:bar)
		{
			System.out.println(Arrays.toString(in));
		}
		System.out.println(Arrays.toString(bar));
		
		
		
	}

}
