package String;

public class trim_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "    abcd      ";

		int i = 0;
		int j = s1.length() - 1;
		
		
		while (true)
		{
			if (s1.charAt(i) == ' ') 
			{
				i++;
			}
			else if(s1.charAt(j)==' ')
			{
				j--;
			}
			else 
			{
				break;
			}

		}
		String s2 = "";
		for (int k = i; k <= j; k++) {
			s2 = s2 + s1.charAt(k);
		}
		System.out.println(s2);
	}

}
