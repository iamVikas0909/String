package String;

public class lowest_frequency {

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 = "weLcome";
			myCode(s1);
		}
		//EndOfMainMethod
		private static void myCode(String s1) 
		{
			int min=Integer.MAX_VALUE;
			char ch=0;
			for(int i=0;i<s1.length();i++)
			{
				int cnt=0;
				for(int j=0;j<i;j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					cnt++;
				}
				if(cnt==0)
				{
					int freq=0;
					for(int j=0;j<s1.length();j++)
					{
						if(s1.charAt(i)==s1.charAt(j))
						freq++;
					}
					if(freq<min)
					{
						min=freq;
						ch=s1.charAt(i);
					}
				}
			}
			System.out.println(min+" "+ch);
		}
	

	
}
