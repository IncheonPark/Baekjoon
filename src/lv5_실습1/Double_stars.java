package lv5_실습1;

import java.util.Scanner;

public class Double_stars {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String stars = "";
		int number = sc.nextInt();
		int subNum = 0;
		for (int i =1; i <= number; i ++) {
			stars += "*";
			System.out.println(stars);
		}
		for (int i =number; i > 1; i--) {
			subNum += 1;
			System.out.println(stars.substring(subNum));
		}
		
	}

}
