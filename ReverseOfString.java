package Task_3;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		System.out.println("Enter the name:");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}
		System.out.println(b);
	}
}