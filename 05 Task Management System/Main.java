import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager tm = new TaskManager();

        while (true) {
            System.out.println("\n1. Add Task\n2. Search Task\n3. Delete Task\n4. View All Tasks\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();
                    tm.addTask(new Task(id, name, status));
                }
                case 2 -> {
                    System.out.print("Enter Task ID to search: ");
                    int id = sc.nextInt();
                    Task task = tm.searchTask(id);
                    System.out.println(task != null ? task : "Task not found.");
                }
                case 3 -> {
                    System.out.print("Enter Task ID to delete: ");
                    int id = sc.nextInt();
                    tm.deleteTask(id);
                }
                case 4 -> tm.displayTasks();
                case 5 -> {
                    sc.close(); // ✅ Closing the scanner
                    System.exit(0);
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
