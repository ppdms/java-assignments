// Vasileios Papadimas 3220150

import java.util.Scanner;

public class App5 {
        public static class PocketCalculator {
                private int a, b;

                PocketCalculator(int i, int ii) {
                        this.a = i;
                        this.b = ii;
                }

                public void showValues () {
                        System.out.printf("1st = %d\n2nd = %d", a, b);
                }

                public void set(int i, int ii) {
                        this.a = i;
                        this.b = ii;
                }
                
                public int product() {
                        return this.a*this.b;
                }

                public int sum() {
                        return this.a+this.b;
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int i, ii;

                System.out.println("Input:");
                System.out.print("1st = ");
                i = sc.nextInt();
                System.out.print("2nd = ");
                ii = sc.nextInt();
                System.out.println();

                PocketCalculator pc = new PocketCalculator(i, ii);
                
                System.out.println("Output:");
                pc.showValues();
                System.out.printf("\nsum is = %d\nproduct is  = %d\n\n", pc.sum(), pc.product());
                
                System.out.println("Input:");
                System.out.print("1st = ");
                i = sc.nextInt();
                System.out.print("2nd = ");
                ii = sc.nextInt();
                System.out.println();
                pc.set(i, ii);
                
                System.out.println("Output:");
                pc.showValues();
                System.out.printf("\nsum is = %d\nproduct is  = %d\n", pc.sum(), pc.product());
                
                System.exit(0);
        }
}
