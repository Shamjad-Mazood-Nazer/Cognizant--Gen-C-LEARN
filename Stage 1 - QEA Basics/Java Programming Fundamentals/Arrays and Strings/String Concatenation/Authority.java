import java.util.Scanner;

class Authority {
	public static void main(String[] args) {
		String fname, lname, fullname, upper;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Inmate's name:");
		fname = sc.nextLine();
		System.out.println("Inmate's father's name:");
		lname = sc.nextLine();

		fullname = fname.concat(" ").concat(lname);
		upper = fullname.toUpperCase();

		for (int i = 0; i < upper.length(); i++) {
			char ch = upper.charAt(i);
			if (!((ch >= 'A' && ch <= 'Z') || ch == ' ')) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("Invalid name");
		} else {
			System.out.println(upper);
		}
		sc.close();
	}
}