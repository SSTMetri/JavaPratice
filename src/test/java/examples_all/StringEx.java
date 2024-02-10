
package examples_all;

public class StringEx 
{
	public static void main(String[] args) 
	{
		String myStr="besant";
		myStr.toUpperCase();
		myStr+="technologies";
		String string=myStr.substring(2,13);
		string=string + myStr.charAt(4);
		System.out.println(string);
		
		String[] s= {"sd","dsc","fv","vd"};
		
		String obj1="besant";
		String obj2="besant";
		if(obj1.hashCode()==obj2.hashCode())
			System.out.println("hashcode equal");
		if(obj1==obj2)
			System.out.println("Same address");
		if(obj1.equals(obj2))
			System.out.println("val is equal");
	}

}
