package encapsulation;

class Mobile
{
	int id;
	String name;
	double cost;
	public Mobile(int id,String name,double cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	public boolean equals(Object ob)
	{
		Mobile mo=(Mobile)ob;
		return this.id==mo.id;
	}
}

public class Boolean_mobile 
{
	public static void main(String[] args) {
		Mobile m1=new Mobile(12,"Samsung",2000.0);
		Mobile m2=new Mobile(12,"Samsung",2000.0);
		
		System.out.println(m1==m2);
		
		boolean result=m1.equals(m2);
		System.out.println(result);
				
	}

}
