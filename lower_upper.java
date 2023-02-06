package String;

public class lower_upper {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//WriteCode Here
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='a' && ch<='z')
			{
				s2+=(char)(ch-32);
			}
			else
			{
				s2+=ch;
			}
		}
		System.out.println(s2);
	}

}
