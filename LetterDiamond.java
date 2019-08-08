package Assignments;

public class LetterDiamond {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			int n = 3;

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print((char)(l + 64));
			}
			for (int k = i; k >= 2; k--) {
				System.out.print((char)(k + 63));
			}

			System.out.println();
		}

		for (int i = 2; i >= 1; i--) {
			int n = 2;

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print((char)(l + 64));
			}
			for (int k = i; k >= 2; k--) {
				System.out.print((char)(k + 63));
			}

			System.out.println();
		}

	}

}
