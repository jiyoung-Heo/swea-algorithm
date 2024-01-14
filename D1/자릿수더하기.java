package D1;

import java.util.Scanner;

public class 자릿수더하기 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		int answer = 0;
		while (T > 0) {
			answer += T % 10;
			T = T / 10;
		}
		
		System.out.println(answer);
	}
}
