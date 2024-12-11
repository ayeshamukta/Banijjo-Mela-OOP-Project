package oop.banijjomelaoop.ayesha_2022861;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductData
{
    private static List<Product> products = new ArrayList<>();
    private static final String dataFile = "Product.dat";


    static
    {
        loadProducts();


    }

   public static void addProduct(Product p)
   {
       products.add(p);
       saveProduct();
   }

   public static List<Product> getProducts()
   {
       return products;
   }

   private static void saveProduct()
   {

       try {
           ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataFile));
           oos.writeObject(products);
           oos.close();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

   }

   private static void loadProducts()

   {

       try {
           ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile));
           products = (List<Product>) ois.readObject();

       } catch (IOException | ClassNotFoundException e)
       {
           products = new ArrayList<>();

       }

   }

//    table view save data
    public static void loadTableData()

    {
        try
        {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dataFile));
            List<Product> proList = (List<Product>) ois.readObject();
//            return FXCollections.observableArrayList(proList);
        }
        catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
