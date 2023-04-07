// Vasileios Papadimas 3220150

import java.util.Scanner;

public class App6 {                
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int input;

                System.out.printf("-- Parking Ticket Payment --\nFee: 5 euros and 24 cents\nPayment...\neuros = ");
                input = 100*sc.nextInt();
                System.out.print("cents = ");
                input += sc.nextInt();

                if (input<524) {
                        System.out.println("\nNot enough money!");
                        System.exit(0);
                }
                
                input -= 524;

                int[] change = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                int[] values = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
                String[] names = {"10 euro", "5 euro", "2 euro", "1 euro", "50 cents", "20 cents", "10 cents", "5 cents", "2 cents", "1 cent"};
                
                System.out.println("\nChange:");

                for (int i = 0; i <= 9; i++) {
                        change[i] = input / values[i];
                        input -= change[i] * values[i];
                        if (change[i] > 0) System.out.printf("%d (%s)\n", change[i], names[i]);
                }
        }
}
