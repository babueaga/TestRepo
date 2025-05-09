import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public class LargestNumber {

	public static void main(String[] args) {

		//Write a code to find the second largest number in the array
		int arr[] = {12, 35, 1, 10, 34, 1};
		
		TreeSet<Integer> hm = new TreeSet<>();
		for(int c : arr) {
			hm.add(c);
		}
		
		System.out.println(hm);
		ArrayList<Integer> list = new ArrayList<>(hm);
		int size = list.size();
		System.out.println(size);
		System.out.println(list.get(size-3));
		
	}
}
