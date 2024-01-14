package D2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 최빈수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			// 테스트케이스 번호
			int number = sc.nextInt();

			// 모든 점수배열
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < 1000; i++) {
				int score = sc.nextInt();
				list.add(score);
			}
			list.sort(Comparator.naturalOrder());

			// 점수별 개수배열
			List<Integer> count = new ArrayList<Integer>();
			//초기세팅
			count.add(0);
			int lastScore = 0;
			for (int i = 0; i < 1000; i++) {
				int curScore = list.get(i);
				// 이전학생보다 1점 큰 경우
				if (lastScore + 1 == curScore) {
					count.add(1);

					// 이전학생보다 1점이상 차이나게 큰 점수
				} else if (lastScore + 1 < curScore) {
					for (int j = 0; j < curScore - lastScore + 1; j++) {
						count.add(0);
					}
					count.add(1);

					// 이전학생과 같은 점수
				} else if (lastScore + 1 > curScore) {
					int lastindex = count.size() - 1;
					count.set(lastindex, count.get(lastindex) + 1);
				}
				lastScore = curScore;
			}
			
			List<Integer> sortCount = new ArrayList<>(count);
			// 정렬된 배열을 통해 가장 큰 개수를 알아낸다.
			sortCount.sort(Comparator.reverseOrder());
			
			int bigCount = sortCount.get(0);
			System.out.println("#"+number+" "+count.lastIndexOf(bigCount));
		}
	}
}
