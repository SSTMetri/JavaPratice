
package examples;

public class RepeatingString 
{
	public static void main(String[] args) {
		String str="Hello welcome to testing testing wold";
		String find="testing";
		int countOfStr=0,x=0;
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo(find)==0) {
				countOfStr++;
			}
		}
		System.out.println("Count of "+find+" is : "+countOfStr);
		//***********************OCCURANCE OF CHARACTERS*****************
		for(int i=0;i<arr.length;i++) {
			int n=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])==0) {
					n++;
				}
			}
			System.out.println("Occurance of "+arr[i]+" is : "+n);
		}
	}

}
