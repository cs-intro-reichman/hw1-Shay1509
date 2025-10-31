// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		String rate = args[1];
		int n = Integer.parseInt(args[2]);

		double newRate = Double.parseDouble(rate);

		double futureValue = currentValue * (Math.pow(1 + (newRate / 100), (double) n));
		System.out.println("After " + args[2] + " years, $" + args[0] + " saved at " +
							newRate + "% will yield $" + (int) futureValue);
	}
}