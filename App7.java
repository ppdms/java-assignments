// Vasileios Papadimas 3220150

import java.util.Scanner;

public class App7 {
        public static class Product {
                private String code, manufacturer, model;
                private float price;
                private int supply;
                
                Product(String code, String manufacturer, String model) {
                        this.code = code;
                        this.manufacturer = manufacturer;
                        this.model = model;
                }

                Product(String code, String manufacturer, String model, float price, int supply) {
                        this(code, manufacturer, model);
                        this.price = price;
                        this.supply = supply;
                }
                
                float getPrice() {
                        return this.price;
                }

                void setPrice(float price){
                        this.price = price;
                }

                void setSupply(int supply){
                        this.supply = supply;
                }

                int procurement(int procured){
                        this.supply += procured;
                        return this.supply;
                }

                int sale(int sold){
                        if (sold > this.supply) return -1;
                        return procurement(-sold);
                }

                public String toString() {
                        String output = "Product\n-------------------------\n";
                        String[][] data = {
                                {"code:", this.code},
                                {"factory:", this.manufacturer},
                                {"model:", this.model},
                                {"price:", Float.toString(this.price)},
                                {"stock:", Integer.toString(this.supply)}
                        };
                        for (int i=0; i<=4; i++) {
                                output += String.format("%-8s  %s\n", data[i][0], data[i][1]);
                        }
                        output += "-------------------------";
                        return output;
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                Product product001 = new Product("001", "TSMC", "XYZ");
                System.out.println(product001.toString());
                
                System.out.print("price = ");
                product001.setPrice(sc.nextFloat());
                
                System.out.print("stock = ");
                product001.setSupply(sc.nextInt());
                
                System.out.println(product001.toString());
                
                System.out.print("sale = ");
                int request = sc.nextInt();
                if (product001.sale(request) == -1) System.out.println("\nNot enough stock to complete sale");
                else System.out.printf("New stock = %d\nAmount to pay = %f\n", product001.sale(0), request*product001.getPrice());
               
                System.out.println(product001.toString());

                System.out.print("supply = ");
                System.out.printf("New stock = %d\n", product001.procurement(sc.nextInt()));
                
                Product product002 = new Product("002", "Foxconn", "ABC", 100, 2);
                System.out.println(product002.toString());
        } 
}
