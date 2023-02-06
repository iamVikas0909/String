package String;

public class Split_method_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s="you all are good student";
		String[] sa=split(s);
		for(String str:sa)
			System.out.println(str);
	}

	private static String[] split(String s) {
		// TODO Auto-generated method stub
		int spacecount=0;

		for (int i = 0; i < s.length(); i++)

			if(s.charAt(i)==' ')
				spacecount++;

		String []sa=new String[spacecount+1];
		int i=0;
		int j=0;
		String temp="";

		for (; i < s.length(); i++) 
		{
			char ch=s.charAt(i);

			if(ch==' ')
			{
				sa[j]=temp;
				j++;
				temp="";
			}
			else
			{
				temp+=ch;
			}
		}
		sa[sa.length-1]=temp;
		return sa;
	}

}
