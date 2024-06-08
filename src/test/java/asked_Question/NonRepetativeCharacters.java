package asked_Question;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NonRepetativeCharacters 
{
	public static void main(String[] args) {
		//Print non-repetative characters
		String str="apple";
		char[] ch = str.toCharArray();
		Set<Character> nonRepetativeCharacters=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {
				nonRepetativeCharacters.add(ch[i]);
			}
		}
		System.out.println(nonRepetativeCharacters);
		
		//********************************
		Map<Character,Integer> map=new TreeMap<>();
		for(char c:ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
		
		//*****************************
		Map<Character,Integer> m=new TreeMap<>();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			m.put(ch[i],count);
		}
		
		
		
		Set<Character> nonRep=new LinkedHashSet<>();
		String str1="dfgh";
		char[] cha=str1.toCharArray();
		for(int i=0;i<cha.length;i++) {
			int count=0;
			for(int j=0;j<cha.length;j++) {
				if(cha[i]==cha[j]) {
					count++;
				}
			}
			if(count==1) {
				nonRep.add(cha[i]);
			}
		}
		
		System.out.println(nonRep);

		

	}

}
