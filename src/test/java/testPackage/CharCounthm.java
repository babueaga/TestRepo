package testPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCounthm {

	public static void main(String[] args) {
	
		String str = "abcdecaghaeklb";
		
		char ch[]=str.toCharArray();
		System.out.println(ch);
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		for(char c : ch) {
			if(!hm.containsKey(c)) {
				hm.put(c, 1);
			}else {
				hm.put(c, hm.get(c)+1);
			}
		}
		System.out.println(hm);

		for(Character b: hm.keySet()) {
			if(hm.get(b) >= 1) {
				System.out.println(b +" "+ hm.get(b));
			}
		}
	}

}
