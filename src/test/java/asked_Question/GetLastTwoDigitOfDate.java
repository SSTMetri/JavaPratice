package asked_Question;

import java.util.Date;

public class GetLastTwoDigitOfDate 
{
	public static void main(String[] args) {
		Date d=new Date();
		String date=d.toString();
		String[] arr=date.split(" ");
		int len=arr.length;
		System.out.println(arr[len-1]);
		String year = arr[len-1];
		String[] sYear = year.split("");  //0 1 2 3
		for(int i=sYear.length-2;i<sYear.length;i++) {
			System.out.print(sYear[i]);
		}
		System.out.println("\nSecond method");
		int y=Integer.parseInt(year);
		System.out.println(y);
		System.out.println(y%100);
		 
		
	}

}
