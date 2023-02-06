package String;

public class freq_simple {

	

		//StartOfMainMethod
		public static void main(String[] args) 
		{
			String s1 = "aweLcome";
			myCode(s1);
		}
		//EndOfMainMethod
		private static void myCode(String s1) 
		{
			int min=99999;
			char ch='0';
			for(int i=0;i<s1.length();i++)
			{
				int count=0;
				for(int j=0;j<i;j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					count++;
				}
				//System.out.println(count+" "+s1.charAt(i));
				if(count==0)
				{
					int freq=0;
					for(int j=0;j<s1.length();j++)
					if(s1.charAt(i)==s1.charAt(j))
					freq++;
					if(freq<min)
					{
						min=freq;
						ch=s1.charAt(i);
					}
				}
			}
			System.out.println(min);
			System.out.println(ch);
		}
	}


	
	
	

