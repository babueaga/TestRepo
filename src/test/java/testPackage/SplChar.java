package testPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SplChar {

	public static void main(String[] args) {

		String str = "ab#$cde,kl";
		String str1 = "";
		String rp=str;
		String finalString ="";
		char ch[] = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character,Integer>();
		List<Character> list = new ArrayList<>();

		for(int i =0; i< str.length();i++) {
			if((ch[i] >= 97 && ch[i] <= 122) || (ch[i] >= 65 && ch[i] <= 90)){
				System.out.println(ch[i]);
				str1=str1+ch[i];

			}else {
				hm.put(ch[i], i);
				System.out.println("else " +ch[i]);
				String x = String.valueOf(ch[i]);
				rp = rp.replace(x,"");
			}
		}
		System.out.println(hm);
		System.out.println(str1);
		for(int j=str1.length()-1; j >= 0; j--) {
			list.add(str1.charAt(j));		
		}
		System.out.println(list);

		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			list.add(m.getValue(), m.getKey());
		}
		System.out.println(list);
		
		for(char a: list) {
			finalString+=a;
		}
		System.out.println(finalString);
	}
}


