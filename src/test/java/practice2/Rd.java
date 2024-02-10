package practice2;


public class Rd {
	//Start counter
	int counter=1;
	static int N;
	
	//Function to print even numbers
	public void peitOddNumber() {
		synchronized (this) {
			//If count till the N
			while(counter<N) {
				//If count is even then print
				while(counter%2 ==0) {
					//Exception handle
					try { 
						wait();
					} catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
				}
				//Print the number
				System.out.println(counter +" ");
				
				//Incremenet counter
				counter++;
				
				//Notify second thread
				notify();
			}
		}
	}
	public void printEvenNumber() {
		synchronized(this) {
			while(counter<N) {
				while(counter%2 ==1) {
					try {
						wait();
					} catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					
					System.out.println(counter +" ");
					counter++;
					
					notify();
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		//Give number N
		N=10;
		//Create an object of class
		final Rd mt=new Rd();
		//Create thread t1
		Thread t1=new Thread(new Runnable() {
			public void run() {
				mt.printEvenNumber();
			}
		});
		//create thread t2
		Thread t2=new Thread(new Runnable() {
			public void run() {
				mt.peitOddNumber();
			}
		});
		//Start both the thread
		t1.start();
		t2.start();
	}
	
		
		
		
		
}