package D2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class 스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T ; t++) {
			int result = 1;
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					int num = sc.nextInt();
					arr[i][j] = num;
				}
			}
			int boxLevel = 0;
			List<Set<Integer>> boxList = new ArrayList<>();

			for (int i = 0; i < 9; i++) {
				Set<Integer> widthSet = new HashSet<>();
				Set<Integer> heightSet = new HashSet<>();
				boxLevel = 0;

				for (int j = 0; j < 9; j++) {
					widthSet.add(arr[i][j]);
					heightSet.add(arr[j][i]);
					if (i / 3 == boxLevel && i % 3 == 0) {
						Set<Integer> boxSet = new HashSet<>();
						for (int k = 0; k < 3; k++) {
							for (int k2 = 0; k2 < 3; k2++) {
								boxSet.add(arr[i + k][i + k2]);
							}
						}
						boxList.add(boxSet);
						boxLevel++;
					}
				}
				if (widthSet.size() != 9 || heightSet.size() != 9) {
					result = 0;
					break;
				}

			}
			for (int i = 0; i < boxList.size(); i++) {
				if (boxList.get(i).size() != 9) {
					result = 0;
					break;
				}
			}
			System.out.println("#" + t +" "+ result);
		}
	}
}
//10
//7 3 6 4 2 9 5 8 1
//5 8 9 1 6 7 3 2 4
//2 1 4 5 8 3 6 9 7
//8 4 7 9 3 6 1 5 2
//1 5 3 8 4 2 9 7 6
//9 6 2 7 5 1 8 4 3
//4 2 1 3 9 8 7 6 5
//3 9 5 6 7 4 2 1 8
//6 7 8 2 1 5 4 3 9

//#1