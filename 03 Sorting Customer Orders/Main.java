public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 2500.50),
            new Order(2, "Bob", 1200.00),
            new Order(3, "Charlie", 5300.75),
            new Order(4, "David", 3000.00),
            new Order(5, "Eve", 1800.25)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) {
            System.out.println(o);
        }

        // Uncomment the method you want to use
        // BubbleSort.sort(orders);
        QuickSort.sort(orders, 0, orders.length - 1);

        System.out.println("\nSorted Orders by Total Price:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
