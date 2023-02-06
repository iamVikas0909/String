package String;

public class Ends_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="abcd";
		String s2="cd";
		
		boolean endswith =s1.endsWith(s2);
		System.out.println(endswith);
		boolean ans=myendsWith(s1,s2);
		System.out.println(ans);
	}

	private static boolean myendsWith(String s1, String s2) {
		
		if(s2.length()<=s1.length())
		{
			int s1index=s1.length()-1;
			int s2index=s2.length()-1;
			while(s2index>=0)
			{
				if(s1.charAt(s1index)!=s2.charAt(s2index))
				{
					return false;
				}
				s1index--;
				s2index--;
			}
			return true;
		}
			
		return false;
	}

}
