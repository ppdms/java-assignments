// Vasileios Papadimas 3220150
import java.util.Scanner;

public class CustomerApp {
        public static void main(String[] args){ 
                CustomerList list = new CustomerList();
                Scanner sc = new Scanner(System.in);

                while (true) {
                        System.out.printf("1. Εισαγωγή πελάτη\n2. Αναζήτηση πελάτη με κωδικό\n3. Εμφάνιση λίστας πελατών\n0. Έξοδος\n");
                        switch (sc.nextInt()) {
                                case 0:
                                        System.exit(0);
                                case 1:
                                        String name, code;
                                        sc.nextLine();

                                        System.out.print("Enter code: ");
                                        code = sc.nextLine();
                                        System.out.print("Enter name: ");
                                        name = sc.nextLine();
                                        System.out.print("Enter registration date (dd/mm/yyyy): ");
                                        String[] parts = sc.nextLine().split("/");
                                        try {
                                                list.InsertCustomer(new Customer(name, code, Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
                                        } catch (Exception e) {
                                                throw new RuntimeException(e);
                                        }
                                        System.out.println();
                                        break;
                                case 2:
                                        sc.nextLine();
                                        System.out.print("Enter customer code: ");
                                        list.LookupCustomer(sc.nextLine());
                                        System.out.println();
                                        break;
                                case 3:
                                        list.DisplayList();
                                        break;
                        }                        

                }
        }

}
