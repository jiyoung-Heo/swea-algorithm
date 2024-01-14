package D2;

import java.util.Scanner;

public class 파리퇴치3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = sc.nextInt();
			int m = sc.nextInt(); 
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int currSum = arr[i][j];
					// 직선
					for (int j2 = 1; j2 < m; j2++) {
						// 하
						if (i + j2 < n && j >= 0)
							currSum += arr[i + j2][j];
						// 상
						if (i - j2 >= 0 && j >= 0)
							currSum += arr[i - j2][j];
						// 우
						if (i >= 0 && j + j2 < n)
							currSum += arr[i][j + j2];
						// 좌
						if (i >= 0 && j - j2 >= 0)
							currSum += arr[i][j - j2];
					}

					if (sum < currSum) {
						sum = currSum;
					}

					currSum = arr[i][j];
					// 대각선
					for (int j2 = 1; j2 < m; j2++) {
						if (i + j2 < n && j + j2 < n)
							currSum += arr[i + j2][j + j2];
						if (i + j2 < n && j - j2 >= 0)
							currSum += arr[i + j2][j - j2];
						if (i - j2 >= 0 && j + j2 < n)
							currSum += arr[i - j2][j + j2];
						if (i - j2 >= 0 && j - j2 >= 0)
							currSum += arr[i - j2][j - j2];
					}
					if (sum < currSum) {
						sum = currSum;
					}
				}
			}
			System.out.println("#" + t + " " + sum);
		}
	}
}
