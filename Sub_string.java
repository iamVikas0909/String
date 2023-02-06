package String;

public class Sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="hefshine";
		
		String s2=mySubstring(0,6,s1);
				System.out.println(s2);
				
	}

	private static String mySubstring(int start, int end, String s1) {
		String s2="";
		
		
		for (int k = start; k < end; k++) {
			
			s2+=s1.charAt(k);
		}
		
		return s2;
	}

}
