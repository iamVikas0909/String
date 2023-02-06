package String;

public class revrse_simple {

	public static void main(String[] args) {
	
				String s1 = "I am a good boy";
				myCode(s1);
			}
			//EndOfMainMethod
			private static void myCode(String s1) 
			{
				//WriteCode Here
				String str="";
				String [] sa=s1.split(" ");
				for(int i=0;i<sa.length;i++)
				{
					String temp=sa[i];
					String s2="";
					for(int j=temp.length()-1;j>=0;j--)
					{
						s2+=temp.charAt(j);
					}
					//System.out.print(s2+" ");
					
					str+=s2+" ";
				
				}
				System.out.println();
				System.out.println(str);
			}
		


		
		
	}

