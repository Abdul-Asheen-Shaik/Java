package Task_3;

import java.util.Scanner;

public class CountOfNonRepeating {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = scanner.next();
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {

					count++;
				}
			}
			if (count == 1) {
				s1 += s.charAt(i);
			}

		}
		System.out.println(s1);
	}
}
