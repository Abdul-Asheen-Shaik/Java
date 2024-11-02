package Task_3;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hellohii");
		// append
		System.out.println("append:");
		System.out.println(sb.append(" Java")); 

		// reverse
		System.out.println("reverse:");
		System.out.println(sb.reverse());

		// insert
		System.out.println("insert:");
		System.out.println(sb.insert(0, "A"));

		// delete
		System.out.println("delete:");
		System.out.println(sb.delete(1, 3));

		// capacity
		System.out.println("capacity:");
		System.out.println(sb.capacity());

		// replace
		System.out.println("replace:");
		System.out.println(sb.replace(1, 3, "ajaaaaaaaaaaa"));

		// ensureCapacity0
		System.out.println("ensureCapacity:");

	}

}
