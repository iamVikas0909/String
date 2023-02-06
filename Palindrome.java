package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="nitin";
		
		if(ispalindrome(s))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	
	}

	private static boolean ispalindrome(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true ;
	}

}
