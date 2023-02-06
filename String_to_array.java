package String;

public class String_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome";		// create string using literals
		System.out.println(s.length()); // this is variable for length

		char[] ch = s.toCharArray();

		for(char alphabet : ch)
		{
			System.out.println(alphabet);
		}

		s = s.concat(" to java");
		System.out.println(s); 

		s = s.toUpperCase();
		System.out.println(s); // for uppercase

		s = s.toLowerCase();		
		System.out.println(s);  // for lowercase

		s = s.replace('e', '*');
		System.out.println(s);    // for replacing element

		System.out.println(s.contains("hello"));  // for finding true or false

	}

}
