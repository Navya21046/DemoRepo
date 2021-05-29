package Assignment;

public class RepeatedWordsInString {

	public static void main(String[] args) {
      String s="Navya is very very very good good girl";
      String[] word=s.split(" ");
      System.out.println(word.length);
      int count=0;
      for(int i=0;i<word.length;i++)
      {
    	  count=1;
    	  for(int j=i+1;j<word.length;j++)
    	  {
    		  if(word[i].equals(word[j])){
    			  count++;
    			 word[j]="0";
    		  }
    	  }
    	  if(word[i]!="0")
    	  System.out.println(word[i]+" = "+count);
    	       }
	}

}
