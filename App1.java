// Vasileios Papadimas 3220150

import java.lang.Math;
import java.util.Scanner;

public class App1 {
        static class MyInteger {
                int val;
                MyInteger(int arg) {
                        val = arg;
                }
                boolean isPrime() {
                        if (val <= 1) return false;
                        if (val == 2) return true;
                        for (int i = 2; i <= Math.sqrt(val); i++) {
                                if (val%i == 0) return false;
                        }
                        return true;
                }
        }

        public static void main(String[] args) {
                System.out.print("Enter an integer: ");
                Scanner sc = new Scanner(System.in);
                MyInteger myint = new MyInteger(sc.nextInt()); 
                String verdict = myint.isPrime() ? "prime" : "composite";
                System.out.printf("The integer %d is %s", myint.val, verdict);
                System.exit(0);
        }
}
