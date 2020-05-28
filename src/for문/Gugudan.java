package for문;

import java.util.Scanner;

public class Gugudan {

	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int input, multi;
        input = sc.nextInt();
        
        for (int i = 1; i < 10; i++) {
            multi = input * i ;
            System.out.println(input +" * "+i+" = "+multi);
        }
    }

}
