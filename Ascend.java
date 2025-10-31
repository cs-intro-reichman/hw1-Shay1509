// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);

		int small = Math.min(a , b);
		int middle1 = Math.max(a , b);
		int smallest = Math.min(small , c);
		int middle2 = Math.max(small , c);
		int big = Math.min(middle1, middle2);
		int biggest = Math.max(middle1 , middle2);

		System.out.println(a + " " + b + " " + c);
		System.out.println(smallest + " " + big + " " + biggest);

	}
}
