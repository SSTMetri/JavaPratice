package asked_Question;

import java.util.ArrayList;

public class ArralistAsked 
{
	public static void main(String[] args) {
		ArrayList a=new ArrayList<>();
		a.add("Geek");
		a.add("Geek");
		a.add(1,"Geek1");
		System.out.println(a);  //[Geek, Geek1, Geek]
	}

}
