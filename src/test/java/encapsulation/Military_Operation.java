package encapsulation;

class Operation
{
	private String name_op;
	private float location;
	public Operation(String name_op,float location)
	{
		this.name_op=name_op;
		this.location=location;
	}
	public String getOpName()
	{
		System.out.println("Generate access code & validate to access name");
		return name_op;
	}
	public float getLocation()
	{
		System.out.println("Generate access code and validate to access location");
		return location;
	}
	public void setName(String na_up)
	{
		System.out.println("Generate access code to update name");
		name_op=na_up;
		System.out.println("Name updated successfylly");
	}
	public void setLocation(float coordinates)
	{
		System.out.println("Generate access code to update cordinates");
		location=coordinates;
		System.out.println("Location updated");
	}
}

public class Military_Operation 
{
	public static void main(String[] args) 
	{
		Operation user1=new Operation("Operation Ganga",124.12f);
		// GETTER METHOD
		String name_ofOp=user1.getOpName();
		System.out.println("Name of operation is : "+name_ofOp);
		float loc_cordinates=user1.getLocation();
		System.out.println("Location is : "+loc_cordinates);
		//SETTER METHOD
//		String updated_name=user1.setName("Operation Shakti");
		user1.setName("Operation Shakti");
		String updated_name=user1.getOpName();
		System.out.println("Updated name is : "+updated_name);
		
		user1.setLocation(1515.24f);
		float updated_coordinates=user1.getLocation();
		System.out.println("Updated location is : "+updated_coordinates);
		
		
	}

}
