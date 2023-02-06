 package String;

public class Index_of_substring {

	public static void main(String[] args) {
		
		String s1="aavcdab";
		String s2="da";
		
		int myAns=myIndexof(s1,s2);
		System.out.println(myAns);
	}

	private static int myIndexof(String s1, String s2) {
		
		if(s2.length()==0)
		{
			return 0;
			
		}
		if(s1.length()<s2.length())
			return -1;
		for (int i = 0; i < s1.length(); i++)
		{
			
			if(s2.charAt(0)==s1.charAt(i))
			{
				int s1index=i;
				int s2index=0;
				int cnt=0;
				while(s2index<s2.length())
				{
					if(s1.charAt(s1index++)==s2.charAt(s2index++))
					{
					
						cnt++;
					}
					else
					{
						break;
					}
				}
		 		if(cnt==s2.length())
				{
					return i;
				}
			}
		}
		   return -1;
	}

}
