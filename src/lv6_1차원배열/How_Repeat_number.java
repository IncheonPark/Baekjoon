package lv6_1차원배열;

import java.util.Scanner;

public class How_Repeat_number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 1;
		String strNum;
		String[] strNums;
		int[] intstrNums;
		int[] answers = new int[10];

		for (int i = 0; i < 3; i ++) {
			number *= sc.nextInt();
		}
		
		strNum = Integer.toString(number);
		//System.out.println(strNum);
		strNums = strNum.split("");
		
		intstrNums = new int[strNums.length];
		
		/*for(int i = 0; i < resultArr.length; i++) { int 배열을 만들면서 배열 항목의 값에 ++를 동시에 실행하는 방법도 있다.
		result[Integer.parseInt(resultArr[i])]++;
		}*/
		for (int x = 0; x < strNums.length; x ++) {
			intstrNums[x] = Integer.parseInt(strNums[x]);
		}
		
		for (int j = 0; j < 10; j ++) {
			for (int iss : intstrNums) {
				if (iss == j) {
					answers[j] ++;
				}
			} 
		}
		
		for (int answer : answers) {
			System.out.println(answer);
		}
		sc.close();
	}

}
