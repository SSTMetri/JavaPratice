package asked_Question;

public class GetCharacters 
{
	public static void main(String[] args) {
        String s="qapitol#$%^&*qaQQQQ";
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]<='Z')) {
                System.out.print(ch[i]);
            }
//            if(ch[i]>='A' && ch[i]<='Z') {
//            	System.out.print(ch[i]);
//            }
        }
	}

}
