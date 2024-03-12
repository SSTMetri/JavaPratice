package asked_Question;

public class InstantRegressionAlertByUnlogged {
	  public static void main(String[] args) {
//	    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//	    Predicate<Integer> isEven = InstantRegressionAlertByUnlogged::isEven;
//	    long count = numbers.stream()
//	               .filter(isEven)
//	               .count();
//	    System.out.println(count);
//	  }
//
//	  static boolean isEven(int number) {
//	    return number % 2 == 0;
//		  System.out.println("First");
//		  try {
//			  System.exit(0); //****To throw security exception, here FINALLY block WON'T be executed
//		  } catch(Exception e) {
//			  System.out.println("Catch");
//		  } finally {
//			  System.out.println("Finally");
//		  }
//		  System.out.println("LAst");
//		  
		  
		  System.out.println("First");
		  try {
			  System.exit(1); 
		  } catch(Exception e)
		  {
			  System.out.println("Catch");
		  } finally {
			  System.out.println("Finally");
		  }
		  System.out.println("LAst");
	  }
}