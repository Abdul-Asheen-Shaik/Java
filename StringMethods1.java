package Task_3;

public class StringMethods1 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s4 = "Hello";
		String s5="HELLO";
		String s3 = s1 + s2;
		//System.out.println(s3);

		// charAt
		System.out.println("chatAt:");
		System.out.println(s1.charAt(4));

		// compareTo
		System.out.println("compareTo:");
		System.out.println(s1.compareTo(s4));
		
		// concat
		System.out.println("concat:");
		System.out.println(s1.concat(s3));
		
		// contains
		System.out.println("contains:");
		System.out.println(s4.contains("w"));
		
		// endsWith
		System.out.println("endsWith:");
		System.out.println(s2.endsWith("e"));
		
		// equals
		System.out.println("equals:");
		System.out.println(s1.equals(s3));
		
		// equalsIgnoreCase
		System.out.println("equalsIgnoreCase:");
		System.out.println(s1.equalsIgnoreCase(s4));
		
		// format
		System.out.println("format:");
		String str=String.format("name is %s",s3);
		System.out.println(str);
		
		// getBytes
		System.out.println("getBytes");
		System.out.println(s1.getBytes());
		
		// getChars
		System.out.println("getChaars");
	
		// indexOf
		System.out.println("indexOf:");
		System.out.println(s2.indexOf("o"));
		
		// intern
		System.out.println("intern");
		System.out.println(s1.intern());
		
		//isEmpty
		System.out.println("isEmpty:");
		System.out.println(s2.isEmpty());
		
		// join
		System.out.println("join:");
		String str1=String.join(" ",s1,s2);
		System.out.println(str1);
		
		//lastIndexOf
		System.out.println("lastIndexOf:");
		System.out.println(s1.lastIndexOf('o'));
        
		// length
		System.out.println("length:");
		System.out.println(s3.length());
		
		// replace
		System.out.println("replace:");
        System.out.println(s1.replace("h", "E"));
        
        // replaceAll
        System.out.println("replaceAll:");
        System.out.println(s1.replaceAll(s1, "meeeee"));
        
        // split
        System.out.println("split:");
       
        // startsWith
        System.out.println("startsWith:");
        System.out.println(s1.startsWith("k"));
        
        // subString
        System.out.println("subString:");
        String st=s1.substring(2);
        System.out.println(st);
        
        //toCharArray
        System.out.println("toCharArray:");
        System.out.println(s1.toCharArray());
        
        //toLowerCase
        System.out.println("toLowerCase:");
        System.out.println(s5.toLowerCase());
        
        //toUpperCase
        System.out.println("toUpperCase:");
        System.out.println(s1.toUpperCase());
        
        //trim
        System.out.println("trim:");
        System.out.println(s3.trim());
        
	}

}
