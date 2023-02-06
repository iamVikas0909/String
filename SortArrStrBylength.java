package String;

public class SortArrStrBylength {

	public static void main(String[] args) 
	{
		String s1 = "welcome to hefshine soft pvt ltd";
		myCode(s1);
	}
	//EndOfMainMethod
	private static void myCode(String s1) 
	{
		String [] sa= s1.split(" ");
		//	System.out.println(Arrays.toString(sa));
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp= sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(sa));
		System.out.println("smallest word : "+sa[0]+"\n"+"longest word : "+sa[sa.length-1]);
	}
}
