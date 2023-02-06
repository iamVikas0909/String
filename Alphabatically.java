package String;

public class Alphabatically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s="you all are good students";
		String [] sa=s.split(" ");

		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++)
			{
				if(sa[i].compareToIgnoreCase(sa[j])>0)
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}	
		}
		for(String temp:sa)
			System.out.print(temp+" ");
	}

}
