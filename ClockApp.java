// Vasileios Papadimas 3220150
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class ClockApp {
        public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
                Clock clock = new Clock();
                String[] parts = sc.nextLine().split(":");
                clock.setHour(Integer.parseInt(parts[0]));
                clock.setMin(Integer.parseInt(parts[1]));
                clock.setSec(Integer.parseInt(parts[2]));
                while (true) {
                        clock.tick();
                        System.out.println(clock);
                        TimeUnit.SECONDS.sleep(1);
                }
        }
}
