package String;

public class lower_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1="Hefshine";


		String s2=Mylowercase(s1);
		System.out.println(s2);
	}

	private static String Mylowercase(String s1) {
		// TODO Auto-generated method stub

		String s2="";

		for(int i=0;i<s1.length();i++)

			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				s2+=(char)(s1.charAt(i)+32);
			}	
				else
					s2+=s1.charAt(i);
			


		

		return s2;
	}

}
