package A;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(6);
		a.add(10);
		System.out.println(listContainsOddNumber(a));
	}

	public static boolean listContainsOddNumber(List<Integer> list) {
		for (int i : list) {
			if (i % 2 == 0) {
				return false;
			}

		}

		return true;
	}

}
