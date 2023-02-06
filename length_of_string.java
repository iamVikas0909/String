package String;

public class length_of_string {
	public static void main(String[] args) {

		String s = "vikas 12 tambe";
		int sum = 0;
		for (int j = 0; j < s.length(); j++) {

			if (s.charAt(j) >= '0' && s.charAt(j) < '9')

			{
				int temp = s.charAt(j) - 48;
				sum+=temp;
			}

		}

		System.out.println(sum);

	}
}
