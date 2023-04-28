// Vasileios Papadimas 3220150
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class AMPMClockApp {
        public static void main(String[] args) throws Exception {
                Scanner sc = new Scanner(System.in);
                AMPMClock clock = new AMPMClock();
                String[] parts = sc.next().split(":");
                System.out.print("AM/PM format? (y/n): ");
                String choice = sc.next();
                if (choice.equals("y")) clock.setAMPM(true);
                clock.setHour(Integer.parseInt(parts[0]));
                clock.setMin(Integer.parseInt(parts[1]));
                clock.setSec(Integer.parseInt(parts[2]));
                for (int i = 0; i<=179; i++) {
                        clock.tick();
                        System.out.println(clock);
                        //TimeUnit.SECONDS.sleep(1);
                }
        }
}
