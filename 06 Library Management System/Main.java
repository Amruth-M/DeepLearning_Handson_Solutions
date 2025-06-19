import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "The Hobbit", "J.R.R. Tolkien"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
            new Book(4, "1984", "George Orwell"),
            new Book(5, "Pride and Prejudice", "Jane Austen")
        };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Book title to search :");

        String searchTitle = sc.nextLine();

        Book result1 = LinearSearch.search(books, searchTitle);
        System.out.println("Linear Search: " + (result1 != null ? result1 : "Not Found"));

        Book result2 = BinarySearch.search(books, searchTitle);
        System.out.println("Binary Search: " + (result2 != null ? result2 : "Not Found"));
    }
}
