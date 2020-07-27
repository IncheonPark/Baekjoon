package lv5_실습1;

import java.util.Scanner;

public class Double_stars2 {
	
	public static void main(String[] args) {
		
		//입력값이 N일떄 처음 별 1개부터 2*1 ~ 2*N-1씩 늘어남
		//별 문장이랑 공백문장이랑 공백+별문장 세가지로 구분
		//공백은 늘어나고, 별은 줄어들고 ,,, 밑에는 공백이 줄어들고 별은 늘어나고
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String blank = "";
		String stars = "*";
		String answer;
		
		for (int i = 1; i < input; i ++) {
			stars += "**";
		}
			answer = blank + stars;
			System.out.println(answer);
			
		for (int j =1; j < input; j ++) {
			blank += " ";
			stars = stars.substring(2);
			answer = blank + stars;
			System.out.println(answer);
		}
		for (int x = 1; x < input; x ++) {
			blank = blank.substring(1);
			stars += "**";
			answer = blank + stars;
			System.out.println(answer);
		}
			
		
		
	}

}
