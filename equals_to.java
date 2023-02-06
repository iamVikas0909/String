package String;

public class equals_to {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String s1="abcd";
		String s2="abcd";

		boolean equals=s1.equals(s2);
		System.out.println(equals);

		boolean myAns=myEquals(s1,s2);
		System.out.println(myAns);

	}

	private static boolean myEquals(String s1, String s2) {
		// TODO Auto-generated method stub

		if(s1.length()==s2.length())
		{
			for (int i = 0; i < s1.length(); i++)
			{


				if(s1.charAt(i)!=s2.charAt(i))
					return false;
			}
			return true;
		}
		else
			return false;

	}
}
