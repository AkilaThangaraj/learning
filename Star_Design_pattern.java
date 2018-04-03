public class Star_Design {
	public static void main(String[] args) {
		System.out.println("Design Pattern 1");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Design Pattern 2");
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Design Pattern 3");
		for (int i = 5; i >= 0; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("Design Pattern 4");
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = i; k >= 0; k--)
				System.out.print("*");
			System.out.println();
		}

	}
}