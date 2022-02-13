package A;

public class StringOperations {

	public static void main(String[] args) {
		System.out.println(conatinsVowels("Ankita"));
	}

	public static boolean conatinsVowels(String A) {
		return A.toLowerCase().matches(".*[a e i o u]*.");
	}

}
