package hello;

public class Reverseproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coding is fun";
		String str1 = "";
		int i = 0,start_index = 0,end_index = str.length()-1;
		for(i = str.length()-1;i >= 0;i--)
		{
			if(str.charAt(i) == ' ')
			{
				String word="";
				start_index = i+1;
				for(int j = start_index;j <= end_index;j++)
				{
					word = word + str.charAt(j);
				}
				
				str1 = str1 + word +" ";
				end_index = i-1;
			}
			
			else
				continue;
		}
		
		String word="";
		start_index = i+1;
		for(int j = start_index;j <= end_index;j++)
		{
			word = word + str.charAt(j);
		}
		
		str1 = str1 + word;
		
		System.out.println(str1);

	}

}
