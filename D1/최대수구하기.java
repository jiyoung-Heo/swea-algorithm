package D1;

import java.util.Arrays;
import java.util.Scanner;

public class 최대수구하기 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		int[] list = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			list[test_case] = sc.nextInt();
		}

		Arrays.sort(list);

		System.out.println(list[list.length / 2]);
	}
}
//0 1 2 3 4
//199
//85 72 38 80 69 65 68 96 22 49 67 51 61 63 87 66 24 80 83 71 60 64 52 90 60 49 31 23 99 94 11 25 24 51 15 13 39 67 97 19 76 12 33 99 18 92 35 74 0 95 71 39 33 39 32 37 45 57 71 95 5 71 24 86 8 51 54 74 24 75 70 33 63 29 99 59 94 52 13 35 99 46 57 71 23 17 3 94 48 77 18 83 11 83 25 59 62 2 78 86 7 94 65 80 32 39 84 60 65 72 61 58 84 8 72 12 19 47 49 49 59 71 52 34 22 21 20 92 33 80 39 74 9 28 97 100 93 29 25 4 66 79 81 98 21 91 62 82 4 59 100 34 1 51 80 92 69 77 39 38 97 51 34 35 19 22 1 67 9 90 31 82 11 51 84 78 70 74 42 100 88 53 80 57 62 32 51 48 63 92 46 4 61 31 98 69 52 88 20
//58