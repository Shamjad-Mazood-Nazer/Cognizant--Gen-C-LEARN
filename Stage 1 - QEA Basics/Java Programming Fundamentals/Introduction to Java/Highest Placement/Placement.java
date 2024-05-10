import java.util.*;

class Placement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int CSE, MECH, ECE;
		System.out.println("Enter the no of students placed in CSE:");
		CSE = sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		ECE = sc.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		MECH = sc.nextInt();

		if (CSE < 0 || MECH < 0 || ECE < 0) {
			System.out.println("Input is Invalid");
		} else if (CSE == MECH && CSE == ECE) {
			System.out.println("None of the department has got the highest placement");
		} else if (CSE > MECH && CSE > ECE) {
			System.out.println("Highest placement\nCSE");
		} else if (MECH > ECE && MECH > CSE) {
			System.out.println("Highest placement\nMECH");
		} else if (ECE > CSE && ECE > MECH) {
			System.out.println("Highest placement\nECE");
		} else if (CSE == ECE) {
			System.out.println("Highest placement\nCSE\nECE");

		} else if (MECH == ECE) {
			System.out.println("Highest placement\nECE\nMECH");

		} else if (CSE == MECH) {
			System.out.println("Highest placement\nCSE\nMECH");

		}
		sc.close();
	}
}