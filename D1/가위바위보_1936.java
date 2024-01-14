package D1;

import java.util.Scanner;
import java.io.FileInputStream;

public class 가위바위보_1936 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		int b;
		b = sc.nextInt();
//		가위는 1, 바위는 2, 보는 3
		
		String result = (T > b) ? "A" : "B";
		
		//가위 vs 보 의 경우
		if (T == 3 && b == 1) {
			result = "B";
		}
		if (b == 3 && T == 1) {
			result = "A";
		}
		
		System.out.println(result);

	}
}
