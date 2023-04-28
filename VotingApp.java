// Vasileios Papadimas 3220150
import java.util.Arrays;

public class VotingApp {
        public static void main(String[] args) {
                int[][] votes = {
                {182, 41, 202},
                {145, 85, 325},
                {195, 15, 115},
                {110, 24, 407},
                {255, 11, 357}};
                 for (int[] row : votes) {
                        System.out.println(Arrays.toString(row));
                 }
                 String[] names = new String[] {"A ", "B ", "C "};
                 int[] total = new int[3];
                 for (int i = 0; i<=2; i++) {
                        for (int j=0; j<=4; j++) {
                                total[i] += votes[j][i];
                        }
                        System.out.println(names[i] + total[i]);
                 }
                 
                 int sum = total[0] + total[1] + total[2];
                 String winner = "";
                 System.out.printf("%-20s%-5s\n", "Name", "Votes (%)");
                 for (int i=0; i<=2; i++) {
                        System.out.printf("%-20s%3.2f%%\n", names[i], (total[i]*100.0)/sum);
                        if (((total[i]*100.0)/sum) >= 50) winner = names[i];
                 }
                 if (!winner.equals("")) {
                         System.out.println(winner + "won!");
                 } else {
                         int min = 2;
                         for (int i = 0; i<=1; i++) {
                                if (total[i] < total[min]) min = i;
                         }
                         if (total[0] == total[1] & total[1] == total[2] & total[2] == total[0]) System.out.println("Split vote!");
                         System.out.print("Runoff between:");
                         for (int i = 0; i<=2; i++) {
                                if (i!=min) System.out.print(" " + names[i]);
                         }
                 }
        }
}
