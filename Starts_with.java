package String;

public class Starts_with {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String s1="hefshine";
		String s2="hes";

		boolean result=myStartwith(s1,s2);
		System.out.println(result);	
	}

	private static boolean myStartwith(String s1, String s2) {


		if(s2.length()>s1.length())
			return false;
		int i=s1.charAt(0);
		int j=s2.charAt(0);
		while(j>=0)

			if(s1.charAt(i)!=s2.charAt(j))
			
				return false;
		i++;
		j++;
			
		return true;

	}

}
