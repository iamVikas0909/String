package String;

public class Digit_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1234";
				 
				boolean result = onlyDigits(s);
		
		if(result)
			System.out.println("only Digits");
		else
			System.out.println("not only digits");
		
	}

	private static boolean onlyDigits(String s) {
		// TODO Auto-generated method stub
		
			for (int i = 0; i < s.length(); i++)
			{
			   char ch = s.charAt(i);
			   if(ch<'0'  || ch>'9')
				   return false;
			}
		return true;
	}

}
