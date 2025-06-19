import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Employee\n2. Search Employee\n3. Delete Employee\n4. Display All\n5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Position: ");
                    String position = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(id, name, position, salary);
                    EmployeeManagement.addEmployee(emp);
                }
                case 2 -> {
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();
                    Employee found = EmployeeManagement.searchEmployee(id);
                    if (found != null) System.out.println(found);
                    else System.out.println("Employee not found.");
                }
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    EmployeeManagement.deleteEmployee(id);
                }
                case 4 -> EmployeeManagement.displayEmployees();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
                
            }
        }
        
    }
    
}
