// Vasileios Papadimas 3220150
public class Clock {
        protected int h, m, s;

        void setHour(int h) {
                this.h = h;
        }
        void setMin(int m) {
                this.m = m;
        }
        void setSec(int s) {
                this.s = s;
        }

        void tick() {
                int secs = (3600*this.h + 60*this.m + this.s + 1) % 86400;
                setHour(secs/3600);
                setMin((secs%3600)/60);
                setSec((secs%3600)%60);
        }

        public String toString() {
                return String.format("%02d:%02d:%02d", h, m, s);
        }

        /*public static void main(String[] args) {
                Clock clock = new Clock();
                clock.setHour(23);
                clock.setMin(59);
                clock.setSec(59);
                clock.tick();
                System.out.println(clock);
        }*/
}
