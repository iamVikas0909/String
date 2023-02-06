
package String;

public class Sum_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="12345";
		
		int sum=sumofDigits(s);
		System.out.println(sum);
	}
	
	private static int sumofDigits(String s)
	{
		int sum=0;
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
				sum=sum+ch-48;
		}
		return sum;
		
	}

	
	
}
