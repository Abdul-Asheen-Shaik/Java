package Task_3;

public class StringMethods {

	public static void main(String[] args) {
		String str = "hello";
		str = str + "world";
		String str1 = "helloworld";
		System.out.println(str);
		if (str.equals(str1)) { // equals
			System.out.println("block 1");
		}
		String str3 = "hello";
		if (str == str3) { // compareTo
			System.out.println("block 2");
		}
		if (str.equals(str3)) {
			System.out.println("block 3");

		}

		// to find the length of the string
		int len = str.length(); // length
		System.out.println(len);

		String str2 = "world";
		String str4 = str2.concat(str); // concat
		System.out.println(str3);

		char c = str.charAt(1); // charAt
		System.out.println(c);

		if (str.contains("e")) { // contains
			System.out.println("string was there");

		}
		String s4 = str.substring(1); // substring
		System.out.println(s4);

		if (str.equalsIgnoreCase("HELLO")) { // equals ignore case
			System.out.println("inside");

		}
		String a = "tea point"; // endsWith
		System.out.println(a.endsWith("t"));
		

	}

}
