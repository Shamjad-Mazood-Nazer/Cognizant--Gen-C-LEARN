import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price, discount, minimum, n, i;

		n = sc.nextInt();
		String[] productList = new String[n];
		sc.nextLine();
		int[] discountList = new int[n];

		for (i = 0; i < n; i++) {
			String[] product = sc.nextLine().split(",");
			String name = product[0];
			price = Integer.parseInt(product[1]);
			discount = Integer.parseInt(product[2]);
			discountList[i] = (price * discount) / 100;
			productList[i] = product[0];
		}
		minimum = discountList[0];

		for (i = 0; i < n; i++) {
			if (minimum > discountList[i]) {
				minimum = discountList[i];
			}
		}

		for (i = 0; i < n; i++) {
			if (minimum == discountList[i]) {
				System.out.println(productList[i]);
			}
		}
		sc.close();
	}
}