package Task_3;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder sbl = new StringBuilder("Asheeeeeeeeee");
		System.out.println(sbl);

		// charAt
		System.out.println("charAt:");
		System.out.println(sbl.charAt(2));

		// length
		System.out.println("length:");
		System.out.println(sbl.length());

		// subString(int beginIndex)
		System.out.println("subString(int beginIndex):");
		System.out.println(sbl.substring(3));

		// subString(int beginIndex, endIndex)
		System.out.println("subString(int beginIndex, endIndex):");
		System.out.println(sbl.substring(0, 3));

	}

}
