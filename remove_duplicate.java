package String;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aaaaaaaaaaaabbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddeeeeeeeeeeeeee";
				
		String s2="";
		
		for (int i = 0; i < s.length(); i++)
		{
		   if(iwalacharisPresentonLeft(s,i)==false)
			   s2=s2+s.charAt(i);
		}
		   System.out.println(s2);
	}
	private static boolean iwalacharisPresentonLeft(String s, int i)

	{
		for (int j = 0; j < i; j++)
			if (s.charAt(i) == s.charAt(j))
				return true;
		return false;

	}

}
