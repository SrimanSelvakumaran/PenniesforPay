import java.util.Scanner;
public class PenniesForPay {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Pennies for Pay Simulation:\nEnter amount of days to graph: ");
		int times = input.nextInt();
		System.out.println("Day # | Amount Earned ($)");
		double function = 0.0;
		double total = 0.0;
		for (int i = 1; i <= times; i++) {
			;
			System.out.printf("%d | $%,.2f\n", i, function);
		}
		System.out.printf("Your final pay is $%,.2f", function);
	}

}
