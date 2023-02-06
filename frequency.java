package String;

public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s="aabbccdd";

		for (int i = 0; i < s.length(); i++)

			if(originalChar(s,i))
			{
				char c = s.charAt(i);
			      int freq =Freq(s,s.charAt(i));
				System.out.println(c+" "+freq) ;
			}

	}

	private static int Freq(String s, char ch) {


		int count =0;
		for (int i = 0; i < s.length(); i++)

			if(s.charAt(i)==ch)
				count++;

		return count;
	}

	private static boolean originalChar(String s, int i) {

		for (int j = 0; j < i; j++) 
		{
			if(s.charAt(i)==s.charAt(j))	
				return false;
		}
		return true;
	}

}
