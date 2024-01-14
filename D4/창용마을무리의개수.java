package D4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 창용마을무리의개수 {
	static List<Integer> aList = new ArrayList<>();
	static List<Integer> bList = new ArrayList<>();
	static ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int result = 0;
			int n = sc.nextInt();
			int m = sc.nextInt();
			list.clear();
			aList.clear();
			bList.clear();
			for (int i = 1; i <= n; i++) {
				list.add(i);
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				aList.add(a);
				bList.add(b);
			}
			while (!aList.isEmpty()) {
				result++;

				int a = aList.get(0);

				test(list, aList, bList, a);
			}
			System.out.println("#" + t + " " + result);
		}
	}

	public static void test(ArrayList<Integer> list, List<Integer> aList, List<Integer> bList, int number) {
		if(list.size() == 0) return;
		//alist가 해당 숫자를 가지고 있으면
		while (aList.contains((Object) number)) {
			int aIndex = aList.indexOf((Object) number);
			//해당숫자지우기
			aList.remove(aIndex);
			list.remove((Object) number);
			//b리스트의 같은 인덱스 값을 가져와서 숫자가 뭔지 알아내기
			int bNumber = bList.get(aIndex);
			//해당숫자 지우기
			bList.remove(aIndex);
			//list에서도 숫자 지우기
			list.remove((Object) bNumber);
			test(list, aList, bList, bNumber);
		}
		while (bList.contains((Object) number)) {
			int bIndex = bList.indexOf((Object) number);
			bList.remove(bIndex);
			list.remove((Object) number);
			int aNumber = aList.get(bIndex);
			aList.remove(bIndex);
			list.remove((Object) aNumber);
			test(list, aList, bList, aNumber);
		}
	}
}
