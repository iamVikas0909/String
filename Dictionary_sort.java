package String;

public class Dictionary_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String s1 = "welcome to hefshine wel";
				String []sa=s1.split(" ");
				
				//System.out.println(Arrays.toString(sa));
				for(int i=0;i<sa.length;i++)
				{
					for(int j=i+1;j<sa.length;j++)
					{
						if(mycompare(sa[i],sa[j])>0)
						{
							String temp=sa[i];
							sa[i]=sa[j];
							sa[j]=temp;
						}
					}
				} 
				for(int i=0;i<sa.length;i++)
				{
					System.out.print(sa[i]+" ");
				}
			}
			private static int mycompare(String s1, String s2)
			{
				for(int i=0;i<s1.length() &&i<s2.length(); i++)
				{
					if(s1.charAt(i)!=s2.charAt(i))
					{
						return s1.charAt(i)-s2.charAt(i);
					}
				}
				return s1.length()-s2.length();	
	}

}
