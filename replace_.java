package String;

public class replace_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="Hefshine";
		String s2=replace(s1,'e','d');
		System.out.println(s2);
	}

	private static String replace(String s1, char c, char d) {
		// TODO Auto-generated method stub
		String s2="";
		
		for (int i = 0; i < s1.length(); i++)
		{
		    if(s1.charAt(i)==c)
		    	s2+=d;
		    else
		    	s2+=s1.charAt(i);
		}
		
		
		return s2;
	}

}
