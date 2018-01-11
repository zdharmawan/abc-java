
public class HighestOfThree {

	public static void main(String[] args) {
		highestOfThree(5,3,3);
	}	

	private static void highestOfThree(int a, int b, int c) {
			int max = 0;
			if (a > max) {
					max = a;
			}
			if (b > max) {
					max = b;
			}
			if (c > max) {
					max = c;
			}
			System.out.println("Highest value: " + max);
	}
}

