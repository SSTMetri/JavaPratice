package asked_Question;

public class Output 
{
	static {
		System.out.printf("%d",1);
	}
	static {
		System.out.printf("%d",2);
	}
	static {
		System.out.printf("%d",3);
	}
	public static int myMethod() {
		return 4;
		
	}
	public int function() {
		return 5;
		
	}
	public static void main(String[] args) {
		System.out.printf("%d",(new Output().function())+ myMethod());
		System.out.println();
		String s="Name",s1="NameISXYZ";
		int retrunComapre = s.compareTo(s1);
		if(retrunComapre==0) {
			System.out.println(s+","+s1+" Are Same");
		}
		else {
			System.out.println(s+","+s1+" Are not same");
		}
//        String s="STR",s1="Str2";
        System.out.println("One");
        if(s.compareTo(s1)==0) {
            System.out.println("Same");
        } else {
            System.out.println("not same");
        }
        System.out.println("Two");
        if(s.equals(s1)) {
        	System.out.println("Same");
        } 
		else {
            System.out.println("not same");
        }
        System.out.println("three");
        if(s.equalsIgnoreCase(s1)) {           
            System.out.println("Same");
        } else {
            System.out.println("not same");
        }
        
        int x=5;
        System.out.println(x<2 ? x<4 ? 10:8:7);
						// Condistion ? c ? a:b:c
						// T ? T ?  a
						// T ? F ?  b
						// F ? T ?  c
						// F ? F ?  c


		
	}

}
