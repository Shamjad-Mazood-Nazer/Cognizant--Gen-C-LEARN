import java.util.Scanner;

class AsciValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		System.out.println("Enter the digits:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

			if (a[i] >= 65 && a[i] <= 90) {
				char ch = (char) a[i];
				System.out.println(a[i] + "-" + ch);
			} else if (a[i] >= 97 && a[i] <= 122) {
				char ch = (char) a[i];
				System.out.println(a[i] + "-" + ch);
			} else {
				char ch = (char) a[i];
				System.out.println(a[i] + "-" + ch);
			}
		}
		sc.close();
	}
}