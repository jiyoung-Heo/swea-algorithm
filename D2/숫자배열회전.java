package D2;

import java.util.Scanner;

//11:09
public class 숫자배열회전 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			// 값들 받아서 arr에 저장
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					int num = sc.nextInt();
					arr[j][j2] = num;
				}
			}
			int[][] arr90 = new int[n][n];
			int[][] arr180 = new int[n][n];
			int[][] arr270 = new int[n][n];

			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					arr90[j][j2] = arr[n-j2-1][j];
					arr180[j][j2] = arr[n-j-1][n-j2-1];
					arr270[j][j2] = arr[j2][n-j-1];
				}
			}
			System.out.println("#"+i);

			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					System.out.print(arr90[j][j2]);
				}
				System.out.print(" ");
				for (int j2 = 0; j2 < n; j2++) {
					System.out.print(arr180[j][j2]);
				}
				System.out.print(" ");
				for (int j2 = 0; j2 < n; j2++) {
					System.out.print(arr270[j][j2]);
				}
				System.out.println();
			}
		}
	}
}
