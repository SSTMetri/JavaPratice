package examples_all;

public class MyThread extends Thread 
{
	public void run()
	{
		System.out.println("Im run mehods");
	}
	public static void main(String[] args) 
	{
		Thread myThread=new Thread(new MyThread());
		myThread.start();
//		myThread.start();		
	}

}
