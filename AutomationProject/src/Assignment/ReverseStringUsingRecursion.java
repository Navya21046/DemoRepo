package Assignment;

public class ReverseStringUsingRecursion {


	public static String reverse(String s)
	{
		//char[] letters=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		return s;
	}
	public static void main(String[] args) {
		reverse("Navya Vijay");

	}

}
