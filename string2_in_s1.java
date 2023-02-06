package String;

public class string2_in_s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s1="hefshine";
		String s2="shink";
		
		
		boolean result=contains(s1,s2);
		System.out.println(result);
	}

	private static boolean contains(String s1, String s2) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				int j=i;
				int k=0;
				int counter=0;
				while(k<s2.length() && j<s1.length())
				{
					if(s1.charAt(j)==s2.charAt(k))
					counter++;
					j++;
					k++;
				}
				if(counter==s2.length())
					return true;
			}
		}
		return false;
	}

}
