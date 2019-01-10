package Basics;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// String Literal - String Constant Pool
//		String str1 = "Hello";
//		
//		String str3 = "Hello";
//		
//		// String Object - Heap
//		String str2 = new String("Welcome");
//		
//		String str4 = new String("Welcome");
//		
//		// Strings
//		
//		str1 = "More Hello";
//		
//		String stradd = str1 + str2;
		
		
String str = "This is";
		

String[] array = new String[str.length()];

for (int i=0; i<array.length-1; i++){
	array[i]= str.charAt(i)+" ";
}
for (int j= array.length-1; j>=0; j--){
	System.out.println(array[j]+ " ");
}

}

//		String str1 = "Hello";
//		String str2 = "Hello";
//		String str3 = "Welcome";
//		String str4 = "";
//		String str5 = "            Spaces all around     ";
//		String str6 = "Hello";
//		
//		System.out.println("Length of the string is: " + str.length());
//		System.out.println("Character at index 2 is: " + str.charAt(2));
//		System.out.println(str.concat(" This is the appended string"));
//		System.out.println("Contains check 1: " + str.contains("is"));
//		System.out.println("Contains check 2: " + str.contains("si"));
//		System.out.println("Starts with check 1: " + str.startsWith("This"));
//		System.out.println("Starts with check 2: " + str.startsWith("is"));
//		System.out.println("Ends with check 2: " + str.endsWith("string"));
//		System.out.println("Ends with check 2: " + str.endsWith("is"));
//		System.out.println("Check contents are equal: " + str1.equals(str2));
//		System.out.println("Check contents are equal: " + str1.equals(str3));		
//		System.out.println("Index of 'h' is: " + str.indexOf('h'));
//		System.out.println("Check if string is empty 1: " + str.isEmpty());
//		System.out.println("Check if string is empty 2: " + str4.isEmpty());
//		System.out.println("Trim the leading and trailing spaces: " + str5.trim());
//		System.out.println("Replace Example: " + str6.replace('e', 'a'));
//		
//		System.out.println("Substring Example 1: " + str.substring(5));
//		System.out.println("Substring Example 2: " + str.substring(5, 10));
//		
//		char[] charArray = str.toCharArray();
//		for (int i = 0; i<charArray.length; i++) {
//			System.out.println("Index " + i + " is: " + charArray[i]);
//		}
//		
//		System.out.println("Lower case: " + str.toLowerCase());
//		System.out.println("Upper case: " + str.toUpperCase());
	}
		
		
	



