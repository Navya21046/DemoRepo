package Assignment;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		System.out.println("Factorial of given number is: "+factorial(10));
	}
	public static int factorial(int n)
	{
		if(n==1) {
			//System.out.println("factorial ("+ n +") = 1");
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
		
	}

}
