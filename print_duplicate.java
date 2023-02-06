package String;

public class print_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="aabbcc";
		for (int i = 0; i < s.length(); i++)
		
		  if(originalChar(s,i)==false)
		  {
			  System.out.println(s.charAt(i));
			  
		  }
	
		
		
	}

	private static boolean originalChar(String s, int i) 
	{
		// TODO Auto-generated method stub
		for (int j = 0; j < i; j++) 
		
		 if(s.charAt(j)==s.charAt(i))
			 return false;
		
		return true;
	}

}
