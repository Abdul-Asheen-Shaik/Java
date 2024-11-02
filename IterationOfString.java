package Task_3;

import java.util.Scanner;

public class IterationOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String s = sc.next();
		char st;
		for (int i = s.length()-1; i >=0; i--) {
			st = s.charAt(i);
			
			System.out.println(st);
		}

	}

}
