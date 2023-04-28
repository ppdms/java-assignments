// Vasileios Papadimas 3220150
public class AMPMClock extends Clock {
        boolean AMPM = false;
        
        public void setAMPM(boolean yes) {
                this.AMPM = yes;
        }

        public String toString() {
                if (AMPM) {
                        return String.format("%02d:%02d:%02d %2s", h>12?h-12:(h==0?12:h), m, s, h>=12?"pm":"am");
                }
                return String.format("%02d:%02d:%02d", h, m, s);
        }

        public static void main(String[] args) throws Exception {
                AMPMClock clock = new AMPMClock(); 
                clock.setHour(23);
                clock.setMin(59);
                clock.setSec(58);
                System.out.println(clock.toString());
                clock.setAMPM(true);
                System.out.println(clock.toString());
                clock.tick();
                clock.tick();
                System.out.println(clock.toString());
                clock.setAMPM(false);
                clock.tick();
                System.out.println(clock.toString());
                /*for (int i = 0; i<= 87000; i++) {
                        clock.tick();
                        System.out.println(clock.toString());
                }*/
        }
}
