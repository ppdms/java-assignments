// Vasileios Papadimas 3220150

public class App4 {
        static int digitSum(int x) {
                if (x <= 9) return x;
                else return digitSum(x/10) + x%10;
        }
        public static void main(String[] args) {
                System.out.println(digitSum(1234));
        }
}
