// Vasileios Papadimas 3220150
public class Customer {
        private String name, code;
        private myDate regDate;

        Customer(String name, String code, int d, int m, int y){
                this.name = name;
                this.code = code;
                this.regDate = new myDate(d, m, y);
        }

        public String getName() {
                return this.name;
        }
        public String getCode() {
                return this.code;
        }
        public myDate getRegDate() {
                return this.regDate;
        }
}       
