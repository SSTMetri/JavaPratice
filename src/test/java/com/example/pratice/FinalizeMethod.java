package com.example.pratice;

public class FinalizeMethod 
{
	public static void main(String[] args) throws InterruptedException {
		String s=new String("Automation");
		s=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println("End");
	}
	
	protected void finalize() {
		System.out.println("Calling finalize method");
	}

}
