package String;

public class remove_specific {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="abcabcaba";
		char ch='b';
		
		String s1="";
		for (int i = 0; i < s.length(); i++)
		{
		   if(s.charAt(i)!=ch)	
		   {
			   s1=s1.concat(s.charAt(i)+"");
		   }
		}
		System.out.println(s1);
	}

}
