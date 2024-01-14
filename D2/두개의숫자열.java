package D2;

import java.util.Scanner;

//11:09
public class 두개의숫자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] nNumber = new int[n];
			int[] mNumber = new int[m];
			int currSum = 0;

			for (int j = 0; j < n; j++) {
				nNumber[j] = sc.nextInt();
			}
			for (int j = 0; j < m; j++) {
				mNumber[j] = sc.nextInt();
			}

			int biggest = 0;
			if (n < m) {
				biggest = 1;
			} else if (n == m) {
				biggest = 2;
			}

			if (biggest == 2) {
				for (int j = 0; j < mNumber.length; j++) {
					currSum += nNumber[j] * mNumber[j];
				}
				System.out.println("#" + i + " " + currSum);
				break;
			}

			for (int j = 0; j <= Math.max(n, m) - Math.min(n, m); j++) {
				int nextSum = 0;
				for (int j2 = 0; j2 < Math.min(n, m); j2++) {
					if (biggest == 0) {
						nextSum += nNumber[j2 + j] * mNumber[j2];
					} else if (biggest == 1) {
						nextSum += nNumber[j2] * mNumber[j2 + j];
					}
				}

				if (currSum < nextSum)
					currSum = nextSum;
			}

			System.out.println("#" + i + " " + currSum);

		}
	}
}
