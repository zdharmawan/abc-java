
public class ComputeNFibonacci {

	public static void main(String args[]) {
		System.out.println("Nth Fibonacci: " + computeNthFibonacci(Integer.parseInt(args[0])));
	}	

	private static int computeNthFibonacci(int n) {
		if (n <= 0)
       return 0;
    else if (n == 1)
       return 1;
   else
      return computeNthFibonacci(n - 1) + computeNthFibonacci(n - 2);
	}
}
