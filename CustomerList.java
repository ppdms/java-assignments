// Vasileios Papadimas 3220150
import java.util.Stack;
import java.util.HashMap;

public class CustomerList {
        private Customer[] customers = new Customer[50];
        private Stack<Integer> free = new Stack<Integer>();
        private HashMap<String, Integer> map = new HashMap<String, Integer>();

        CustomerList(){
                for (int i=49; i>=0; i--){
                        free.push(i);
                }
        }

        void InsertCustomer(Customer customer) throws Exception{
                if (free.capacity() == 0) throw new RuntimeException();
                map.put(customer.getCode(), free.pop());
                customers[map.get(customer.getCode())] = customer;
        }

        void LookupCustomer(String code){
                if (map.containsKey(code)) {
                        System.out.printf("Name: %s\nRegistration Date: %s\n", customers[map.get(code)].getName(), customers[map.get(code)].getRegDate());                        
                } else {
                        System.out.println("Customer is not in list.");
                }
        }
        void DisplayList(){
                System.out.printf("%-6s %-20s %-10s\n", "Code", "Name", "Reg. Date");
                for (int i = 0; i<=49; i++) {
                        if (!free.contains(i)) System.out.printf("%-6s %-20s %-10s\n", customers[i].getCode(), customers[i].getName(), customers[i].getRegDate());
                }
        }
}
