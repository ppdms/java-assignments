// Vasileios Papadimas 3220150
public class myDate {
        private int d, m, y;

        myDate(int d, int m, int y){
                this.d = d;
                this.m = m;
                this.y = y;
        }

        public String toString() {
                return d + "/" + m + "/" + y;
        }
}
