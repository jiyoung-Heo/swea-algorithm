package D1;

import java.util.Scanner;

public class 홀수만더하기 {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				int number = sc.nextInt();
				if (number % 2 != 0) {
					sum += number;
				}
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}
//3
//3 17 1 39 8 41 2 32 99 2
//22 8 5 123 7 2 63 7 3 46
//6 63 2 3 58 76 21 33 8 1   
// 
//#1 200
//#2 208
//#3 121