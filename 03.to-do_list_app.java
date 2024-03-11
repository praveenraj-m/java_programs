import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        // Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Main program loop
        while (true) {
            // Display menu options
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Quit");

            // Read user's choice
            String choice = scanner.nextLine();

            // Process user's choice using a switch statement
            switch (choice) {
                case "1":
                    // Add a new task to the list
                    System.out.print("\nEnter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case "2":
                    // View all tasks in the list
                    System.out.println("\nTasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case "3":
                    // Quit the program
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    // Inform the user of an invalid choice
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
