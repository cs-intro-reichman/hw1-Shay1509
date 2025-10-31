// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
	    int payment = Integer.parseInt(args[3]);
		double dividedPayment = Math.ceil((double) payment / 3);
		System.out.println("Dear " + args[2] + ", " + args[1] + ", and " +
							args[0] + ": pay " + dividedPayment + " Shekels each.");
	}
}