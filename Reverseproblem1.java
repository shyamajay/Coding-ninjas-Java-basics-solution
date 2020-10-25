package hello;

public class Reverseproblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coding is fun";
		String str1 = " ";
		int i = 0,start_index = 0,end_index = 0;
		for(i = 0;i < str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				String word="";
				end_index = i-1;
				for(int j = start_index;j <= end_index;j++)
				{
					word = str.charAt(j) + word;
				}
				
				str1 = str1 + word +" ";
				start_index = i+1;
			}
			
			else
				continue;
		}
		
		String word="";
		end_index = str.length()-1;
		for(int j = start_index;j <= end_index;j++)
		{
			word = str.charAt(j)+word;
		}
		
		str1 = str1 + word;
		
			System.out.println(str1);

	}

}
