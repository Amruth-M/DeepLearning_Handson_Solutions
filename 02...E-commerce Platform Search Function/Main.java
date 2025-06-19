import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Camera", "Electronics"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Book", "Education")
        };
        System.out.print("Enter the product to search :");
        Scanner sc=new Scanner(System.in);

        String searchName = sc.nextLine();

        Product result1 = LinearSearch.search(products, searchName);
        System.out.println("Linear Search: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = BinarySearch.search(products, searchName);
        System.out.println("Binary Search: " + (result2 != null ? result2 : "Not Found"));
        sc.close();
    }
}
