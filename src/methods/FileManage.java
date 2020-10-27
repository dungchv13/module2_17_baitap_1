package methods;

import quantities.Product;

import java.io.*;
import java.util.ArrayList;

public class FileManage {
    private static final String PATH = "Demo.txt";
    public static void writeFile(ArrayList<Product> products) throws IOException {
        FileOutputStream fos = new FileOutputStream(PATH);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(products);

        oos.close();
        fos.close();
    }

    public static ArrayList<Product> readFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(PATH);
        ObjectInputStream fos = new ObjectInputStream(fis);

        ArrayList<Product> products =(ArrayList<Product>) fos.readObject();

        return products;

    }

}
