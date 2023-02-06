package String;

public class max_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcdabcdebcdf";
		
		String max="";
		for (int i = 0; i < s1.length(); i++)
		{
			String s2="";
		      for (int j = i; j < s1.length(); j++)
		      {
				  char ch=s1.charAt(j);
				  
				  if(ischarpresent(s2,ch))
				  {
					  if(s2.length()>max.length())
						  max=s2;;
						  s2="";
						  break;
				  }
				  else
				  {
					s2=s2+ch;  
				  }
			}	
		}
		System.out.println(max);
		
		
	}

	private static boolean ischarpresent(String s2, char ch) {
	
		
		for (int i = 0; i < s2.length(); i++)
		{
		  if(s2.charAt(i)==ch)
			  return true;
		}
		return false;
	}

}
