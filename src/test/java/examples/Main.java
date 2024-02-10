package examples;

public class Main {
	 public static void main(String[] args) {
	  int x = 5;
	  int y = 10;
	  try {
	   y /= x;
	   System.out.println(y);
	  } catch (Exception e) {
	   ++x;
	  } finally {
	   x++;
	  }
	  x++;
	 }
	}
