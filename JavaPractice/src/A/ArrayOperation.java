package A;

public class ArrayOperation {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 6 };
		int k = 0, l = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] + A[j] == 6) {
					k = i;
					l = j;
				}
			}

		}
		System.out.println(k + "" + l);
	}

}
