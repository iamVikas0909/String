package String;

public class element_at_specific_index {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		int index=3;
		myCode(s1,index);
	}
	//EndOfMainMethod
	private static void myCode(String s1,int index) 
	{
		//write code here
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==index)
				System.out.println(ch[i]);
		}
		if(ch.length<=index)
		{
			System.out.println("index out of range");
		}
	}

 




}
