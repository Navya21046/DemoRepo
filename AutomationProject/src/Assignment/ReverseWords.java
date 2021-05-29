package Assignment;

public class ReverseWords {

	public static void main(String[] args) {
		String s="Navya Vijay";
//		String[] word=s.split(" ");
//		String rev=" ";
//		System.out.println(word.length);
//		for(int i=word.length-1;i>=0;i--) {
//			rev=word[i];
//			System.out.print(rev+" ");
//		}
		String[] word=s.split(" ");
		for(int j=0;j<word.length;j++)
		{	
	
		for(int i=word[j].length()-1;i>=0;i--)
		{
			char word1 = word[j].charAt(i);
			System.out.print(word1);
			
		}
		
		}

	}

}
