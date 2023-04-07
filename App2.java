// Vasileios Papadimas 3220150

import java.lang.Math;
import java.util.Scanner;

public class App2 {
        static boolean isPrime(int val) {
                if (val <= 1) return false;
                if (val == 2) return true;
                for (int i = 2; i <= Math.sqrt(val); i++) {
                        if (val%i == 0) return false;
                }
                return true;
        }

        public static void main(String[] args) {
                System.out.print("Enter an integer: ");
                Scanner sc = new Scanner(System.in);
                int input = sc.nextInt();
                String verdict = isPrime(input) ? "prime" : "composite";
                System.out.printf("The integer %d is %s", input, verdict);
                System.exit(0);
        }
}
