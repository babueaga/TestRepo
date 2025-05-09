package testPackage;

import java.util.HashMap;
import java.util.Map;


public class Hhmap {

	public static void main(String[] args) {
		String abc = "abcdfabfklc";
		char ch[]=abc.toCharArray();
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(char a : ch) {
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}else {
				hm.put(a, 1);
			}
		}
		
		for(char name : hm.keySet()) {
		//	System.out.println(hm.get(name));
		}
		
		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		String name = " I25am32test34engineer";
		int sum=0;
		char ch1[] = name.toCharArray();
		for(char a : ch1) {
			if(Character.isDigit(a)) {
				sum+=Character.getNumericValue(a);
			}
		}
		System.out.println(sum);
	}
}
