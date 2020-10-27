package methods;

import quantities.Product;

import java.io.*;
import java.util.ArrayList;

public class ProductManage {
    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product product){
        products.add(product);

        try{
            FileManage.writeFile(products);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("add success");
    }
    public void displayAll(){
        try{
            products = FileManage.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Product p:products) {
            System.out.println(p.toString());
        }
    }
    public void displayById(int id)  {
        try {
            products = FileManage.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        boolean check = false;
        for (Product p:products) {
            if(p.getId() == id){
                System.out.println(p.toString());
                check = true;
            }
        }
        if(!check){
            System.out.println("ko co san pham co id nay");
        }
    }
}
