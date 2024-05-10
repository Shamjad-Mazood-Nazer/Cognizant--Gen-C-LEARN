import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ltr, dst;
		System.out.println("Enter the no of liters to fill the tank");
		ltr = sc.nextInt();
		if (ltr <= 0) {
			System.out.println(ltr + " is an Invalid Input");
		} else {
			System.out.println("Enter the distance covered");
			dst = sc.nextInt();

			if (dst <= 0) {
				System.out.println(dst + " is an Invalid Input");
			} else {
				double miles, gallon, cost;
				double fuelConsumption = ((double) ltr / dst) * 100;
				miles = dst * 0.6214;
				gallon = ltr * 0.2642;
				cost = miles / gallon;
				System.out.println("Liters/100KM");
				System.out.printf("%.2f", fuelConsumption);
				System.out.println("\nMiles/gallons");
				System.out.printf("%.2f", cost);
			}
		}
		sc.close();
	}
}