package String;

public class remove_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="      You           all are very            very     very good student             ";
		
		System.out.println(s);
		s=removeLeaningandTrailing(s);
		s=removeInBetweenSpaces(s);
		System.out.println(s);
	}

	private static String removeInBetweenSpaces(String s) {
		// TODO Auto-generated method stub
		
		String s2="";
		
		for (int i = 0; i < s.length(); i++)
		{
		  if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
		  {}
		  else
		  {
			  s2=s2+s.charAt(i);
		  }
		}
		return s2;
	}

	private static String removeLeaningandTrailing(String s)

	{
		int i=0;
		while(s.charAt(i)==' ')
			i++;
		int j=s.length()-1;
		while(s.charAt(j)==' ')
			j--;
		String s2="";
		for (int k = i; k <=j; k++)
		{
		   s2=s2+s.charAt(k);
		   
		}
		return s2;
	}
	
}
