package testPackage;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test45 {

	public static void main(String[] args) {

		String str= "abcabcadefdfek" ;


		HashMap<Integer,Character> hm = new LinkedHashMap<Integer,Character>();
		char ch[] = str.toCharArray();

		for(int i =0; i < ch.length;i++) {
			hm.put(i, ch[i]);
		}
		System.out.println(hm);
		int count;
		for(int j=0; j < ch.length;j++) {
			count=0;
			for(Map.Entry<Integer, Character> m : hm.entrySet()) {
				if(hm.containsValue(ch[j])) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

