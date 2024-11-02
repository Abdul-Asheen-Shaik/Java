package Task_3;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.next();
		String vow = "";
		String con = "";
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			if ('a' == str.charAt(i) || 'e' == str.charAt(i) || 'i' == str.charAt(i) || 'o' == str.charAt(i)
					|| 'u' == str.charAt(i)) {
				vow += str.charAt(i);
			} else {
				con += str.charAt(i);
			}
		}
		System.out.println("vowels : " + vow);
		System.out.println("consonants : " + con);
		for (int j = vow.length() - 1; j >= 0; j--) {
			rev += vow.charAt(j);
		}
		System.out.println("reverse : " + rev);
		System.out.println("append : " + rev+con);
	}

}
