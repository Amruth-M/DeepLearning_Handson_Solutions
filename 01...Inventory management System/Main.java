import java .util.HashMap;
import java.util.Scanner;

public class Main{
    static HashMap<Integer,Product>inventory=new HashMap<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("1.Add product \n2.Update Product \n3.Delete product \n4.Display Inventory \n5.Exit \n");
            int choice=sc.nextInt();

            switch(choice){
                case 1 ->addproduct(sc);
                case 2->updateproduct(sc);
                case 3->deleteproduct(sc);
                case 4->displayinventory();
                case 5->System.exit(0);
                default -> System.out.print("invalid choice");
            }
        }
    }

    static void addproduct(Scanner sc){
        System.out.print("Enter product ID :");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter product name :");
        String name=sc.nextLine();
        System.out.print("Enter Quantity :");
        int qty=sc.nextInt();
        System.out.print("Enter price :");
        double price=sc.nextDouble();

        Product p=new Product(id,name,qty,price);
        inventory.put(id,p);
        System.out.print("Product added.\n\n");
    }

    static void updateproduct(Scanner sc){
        System.out.print("Enter the product id to update.");
        int id=sc.nextInt();
        if(!inventory.containsKey(id)){
            System.out.print("product not found !");
            return;
        }
        Product p=inventory.get(id);
        System.out.print("Enter new Quantity :");
        p.quantity=sc.nextInt();
        System.out.print("Enter new price :");
        p.price=sc.nextDouble();
        System.out.print("Product updated .\n\n");
    }

    static void deleteproduct(Scanner sc){
        System.out.print("Enter product id to delete :");
        int id=sc.nextInt();
        if(inventory.remove(id)!=null){
            System.out.print("Product deleted \n\n.");
        }else{
            System.out.print("product not found !");
        }
    }

    static void displayinventory(){
        if(inventory.isEmpty()){
            System.out.print("Inventory is null.\n");
        }else{
            inventory.values().forEach(System.out::println);
        }
    }
}