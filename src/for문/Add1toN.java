package for문;

import java.util.Scanner;

public class Add1toN {

	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int input, sum;
		     input = sc.nextInt();
		     sum = 0;
		        for(int i =1; i <= input; i++){
		            sum = sum + i;
		        }
		        System.out.println(sum);
		    }

}
