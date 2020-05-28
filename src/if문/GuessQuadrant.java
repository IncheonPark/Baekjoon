package if문;

import java.util.Scanner;

public class GuessQuadrant {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, qur;
        
        x = sc.nextInt();
        y = sc.nextInt();
        
        if (x > 0) {
            if ( y > 0) {
                qur = 1;
                System.out.println(qur);
            } else if (y < 0)  {
                qur = 4;
                System.out.println(qur);
            }
            
        } else if ( x < 0) {
            if ( y > 0) {
                qur = 2;
                System.out.println(qur);
            } else if (y < 0) {
                qur = 3;
                System.out.println(qur);
            }
            
        }
        
    }

}
