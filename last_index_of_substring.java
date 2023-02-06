package String;

public class last_index_of_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcdab";
		String s2="ab";
		
		
		int lastindex=lastindex(s1,s2);
		System.out.println(lastindex);

	}

	private static int lastindex(String s1, String s2) {
		for (int i = 0; i <= s1.length()-s2.length(); i++)
		{
			if(s2.charAt(0)==s1.charAt(i))
			{
				int s1index=i;
				int s2index=0;
				int cnt=0;
				while(s2index<s2.length())
				{
					
					if(s1.charAt(s1index)==s2.charAt(s2index))
					{
						s1index++;
						s2index++;
						cnt++;
					}
					else
					{
						break;
					}
				}
				if(cnt==s2.length()) 
				{
				}
			}
		}
		return -1;
	}

}
