package lv3_for문;

import java.util.Scanner;

public class RepeatAddAB {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a,b,t;
	        
	        t = sc.nextInt();
	        for (int i=0; i < t; i++) {
	            a = sc.nextInt();
	            b = sc.nextInt();
	            
	            System.out.println(a+b);
	        }
	    }
}
