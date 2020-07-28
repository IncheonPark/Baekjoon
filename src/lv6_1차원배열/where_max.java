package lv6_1차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class where_max {
	
	//인트 배열 한개랑 정렬해줄 인트배열 한개 해서 총 두개의 배열 필요
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputs = new int[9];
		int[] sorted = new int[9];
		
		for (int i = 0; i < 9; i ++ ) {
			inputs[i] = sc.nextInt();
			sorted[i] = inputs[i];
		}
		Arrays.sort(sorted);
		
		for (int j = 0; j < 9; j ++ ) {
			if (inputs[j] == sorted[sorted.length-1]) {
				System.out.println(sorted[sorted.length-1]);
				System.out.println(j+1);
			}
		}
	}

}
