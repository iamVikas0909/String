package String;

public class Compare_to {

	public static void main(String[] args)
	{

		String s1="hefshine";
		String s2="hefshine";
		
		int num1=mycompareto(s1,s2);
		
		System.out.println(num1);
		
	}
	private static int mycompareto(String s1, String s2) 
	{	
		for(int i=0;i<s1.length()&&i<s2.length(); i++)
		{	
			
			char ch1=s1.charAt(i);
			
			char ch2=s2.charAt(i);

			if(ch1!=ch2)
				
					return ch1-ch2;	
		}
		
	     	return s1.length()-s2.length();	
	
	}
}