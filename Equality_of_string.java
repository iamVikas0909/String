package String;

public class Equality_of_string {


	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="bacd";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		boolean re= MyEq(s1,s2);
		System.out.print(re);
	}
	private static boolean MyEq(String s1, String s2)
	{
		if(s2.length()==s1.length())
		{
			int cnt=0;
		
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
					cnt++;
			}
			if(cnt==s2.length())
				return true;
			else
				return false;		
		}
		return false;
	}
}


