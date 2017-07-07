package less05HomeWork;

public class Main {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JavaScript";
		System.out.println(compareToCustom(str1, str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(compareToCustom("A", "a"));
		System.out.println(compareToCustom("c", "b"));
		String[] strArray = { "a", "c", "b", "k", "z", "abc", "ac", "ab" };
		for (int j = 0; j < strArray.length; j++) {
			for (int i = j + 1; i < strArray.length; i++) {
				if (compareToCustom(strArray[i], strArray[j]) < 0) {
					String temp = strArray[j];
					strArray[j] = strArray[i];
					strArray[i] = temp;
				}
			}
			System.out.println(strArray[j]);
		}

	}

	static int compareToCustom(String str1, String str2) {
		int res = 0;
		if (str1.length() < str2.length() || str1.length() == str2.length()) {

			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					res = str1.charAt(i) - str2.charAt(i);
				} else {
					res = str1.length() - str2.length();
				}
			}
		} else {
			for (int i = 0; i < str2.length(); i++) {
				if (str2.charAt(i) != str1.charAt(i)) {
					res = str2.charAt(i) - str1.charAt(i);
				} else {
					res = str1.length() - str2.length();
				}
			}
		}
		return res;
	}
}
