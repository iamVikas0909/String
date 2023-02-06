package String;

public class ends_with_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//                i
		String s1="hefshine";
		//             j
		String s2="shine";
		
		boolean result=myendswith(s1,s2);
		System.out.println(result);
		
	}

	private static boolean myendswith(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s2.length()>s1.length())
			return false;
		
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		
		while(j>=0)
		{
			
			if(s1.charAt(i) != s2.charAt(j))
			
				return false;    
		i--;
		j--;
		}
			
			
		return true;
	}

}
