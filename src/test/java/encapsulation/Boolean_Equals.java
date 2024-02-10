package encapsulation;

class CurrencyNote
{
//	public static final int a=10;
//	public static final int b; // not allowed
//	public static int b; // allowed 
//	final int z=10;
	int serialNum;
	String colour;
	int value;
	public CurrencyNote(int serialNum,String colour,int value)
	{
		this.serialNum=serialNum;
		this.colour=colour;
		this.value=value;
	}
	public boolean equals(Object ob)  // notes is getting stored in ob reference variable,
									  // ob is pointing to note2, but it is UPCASTED. we need to downcast it
	{
		CurrencyNote ser=(CurrencyNote)ob;
		return this.serialNum==ser.serialNum;
	}
}

public class Boolean_Equals 
{
	public static void main(String[] args) 
	{
		CurrencyNote note1=new CurrencyNote(121212,"RED",500);
		CurrencyNote note2=new CurrencyNote(121212,"RED",500);
		System.out.println(note1==note2);  // false
		
//		boolean res=note1.equals(note2);
//		System.out.println(res);  // false when public boolean equals(Object ob) IS NOT CREATED
		
		boolean res=note1.equals(note2);
		System.out.println(res);  // true
		
		
	}

}
