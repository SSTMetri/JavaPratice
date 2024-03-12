package practice2;

public class letsPractice {

final String out = "Hello World";

public static void main(String[] args) {
	letsPractice practice = new letsPractice();
	practice.helloFriend();
    String s="RAM";
    String rev="";
    for(int i=s.length()-1;i>=0;i--){
        rev=rev+s.charAt(i);
    }
    
    System.out.println(rev);
    
    StringBuffer stt=new StringBuffer("MYname");
    System.out.println(stt.reverse());



}

public void helloFriend() {
System.out.println(out);
}

}
