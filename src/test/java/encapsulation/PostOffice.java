package encapsulation;

class AadharCard
{
	private String name;
	private long aadharNum;
	private long contact;
	public AadharCard(String name,long aadharNum,long contact)
	{
		this.name=name;
		this.aadharNum=aadharNum;
		this.contact=contact;
	}
	// GETTER METHOD 
	public String getName()
	{
		System.out.println("Get OTP and validate");
		return name;
	}
	public long getAadhar()
	{
		System.out.println("Get otp and validate");
		return aadharNum;
//		System.out.println("Validation successful");
	}
	public long getContact()
	{
		System.out.println("Get Otp & validate");
		return contact;
	}
	// SETTER METHOD (reinitialization of info or attrbute value)
	public void setContact(long con1)
	{
		System.out.println("Generate OTP for updating contact");
		contact=con1;
		System.out.println("Contact updated successfully");
	}
	public void setName(String na)
	{
		System.out.println("Generate OYP & validate for updating ");
		name=na;
		System.out.println("Name updated successfully");
	}
	
}

public class PostOffice 
{
	public static void main(String[] args) 
	{
		
		AadharCard user1=new AadharCard("Ram",85296374L,8965452231L);
//		System.out.println(user1.name);
//		System.out.println(user1.aadharNum);
//		System.out.println(user1.contact);
		
		// GETTER METHOD 
		String name_is=user1.getName();
		System.out.println("Name is : "+name_is);
		
		long aadhar_num=user1.getAadhar();
		System.out.println("Aadhar Number : "+aadhar_num);
		
		long concatInfo=user1.getContact();
		System.out.println("Concat of user is : "+concatInfo);
		
		// SETTER METHOD
		user1.setContact(11111111L);
		long contact_updated=user1.getContact();
		System.out.println("Updated Concat of user is : "+contact_updated);
		
		user1.setName("Ram Ramayan");
		String new_name=user1.getName();
		System.out.println("Updated name is : "+new_name);
		
		
		
	}

}
