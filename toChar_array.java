package String;

import java.util.Arrays;
import java.util.LinkedList;

public class toChar_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hefshine";
		
		char[] ca=s1.toCharArray();
		System.out.println("java method : "+Arrays.toString(ca));
		
		char[] ca2=myToCharArray(s1);
		System.out.println(Arrays.toString(ca2));
		
		
		LinkedList<Integer> list=new LinkedList<>();
		list.pollLast();

	}

	private static char[] myToCharArray(String s1) {
		// TODO Auto-generated method stub
		
		char[] ca= new char[s1.length()];
		
		for (int i = 0; i < s1.length(); i++)
		{
		    ca[i]=s1.charAt(i);	
		}
		return ca;
	}

}
