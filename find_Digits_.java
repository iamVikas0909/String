package String;

public class find_Digits_ {


	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="1f23";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		//write code here
		int cnt=0;
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0'  && s1.charAt(i)<='9')
				sum+=(s1.charAt(i)-48);
				cnt++;
		}
		System.out.println(sum);
		if(cnt==s1.length())
		{
			System.out.println("contains only digits");
		}
		else
		{
			System.out.println("not contains only digit");
		}
	}

}
