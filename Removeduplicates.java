package hello;
import java.util.Scanner;
public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaaaa";
		String outcome = s.charAt(0)+"";
		int j = 0;
		for(int i = 1;i < s.length();i++)
		{
			if(s.charAt(i) != outcome.charAt(j))
			{
				outcome += s.charAt(i);
				j++;
			}
		}
		
		System.out.println(outcome);
	}

}
