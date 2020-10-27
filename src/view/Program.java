package view;

import methods.ProductManage;
import quantities.Product;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ProductManage pm = new ProductManage();

        do{
            System.out.println("-------------------MENU-----------------");
            System.out.println("1.Add Product.");
            System.out.println("2.Display All Product");
            System.out.println("3.Display Product up to ID");
            System.out.print("chose:");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    //int id, String name, String supplier, double price
                    System.out.print("Enter product Id:");
                    int id1 = Integer.parseInt(input.nextLine());
                    System.out.print("Enter product name:");
                    String name1 = input.nextLine();
                    System.out.print("Enter product supplier:");
                    String supplier1 = input.nextLine();
                    System.out.print("Enter product price:");
                    double price1 = Double.parseDouble(input.nextLine());

                    pm.add(new Product(id1,name1,supplier1,price1));
                    break;
                case 2:
                    pm.displayAll();
                    break;
                case 3:
                    System.out.print("Enter product Id:");
                    int id3 = Integer.parseInt(input.nextLine());
                    pm.displayById(id3);
                    break;
            }
        }while(true);
    }
}
