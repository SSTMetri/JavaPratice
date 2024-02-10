package examples_all;

public class MainMethod 
{
	    public static void main(String[] args) {
	        System.out.println("This is the standard main method.");
	        // You can call other overloaded main methods here.
	        main(10);
	        
	        
	    }
	    public static void main(int number) {
	    	main("Msg");
	        System.out.println("Overloaded main with int: " + number);
	          }
	    public static void main(String message) {
	        System.out.println("Overloaded main with String: " + message);
	        }
	    
}
