package String;

public class yoChar_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="abcd";
		
		
		char []ca=new char[s1.length()];
		
		for (int i = 0; i < ca.length; i++) {
			char ch=s1.charAt(i);
			ca[i]=ch;
		}
		for (int j = 0; j < ca.length; j++) {
			
		
		System.out.println(ca[j]);
		}
	}

}
