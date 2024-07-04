import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    // 1. Ask the user to enter the number of items they want to purchase
    System.out.print("How many items are you purchasing? ");
    int itemCount = scanner.nextInt(); // 2.Read number of items as an integer
    scanner.nextLine(); // Consume the trailing newline character. 
    double totalCost = 0.0; // 3. Initialize total cost to zero

    // Use a for loop to iterate over each item
    // 4. Loop through each item to get its name and price
    for (int i = 1; i <= itemCount; i++) {
        System.out.println("\nEnter details for item " + i + ":");
      // 5. Prompt the user to enter the name of the item
      System.out.print("Enter item name: ");
      String itemName = scanner.nextLine(); // Corrected: Read item name directly
      // 6. Prompt the user to enter the price of the item
      System.out.print("Enter item price: $");
      // 7. Read item price
      double itemPrice = scanner.nextDouble(); 
      scanner.nextLine(); // Consume the trailing newline after reading the price
      // 8. Add item price to total cost
      totalCost += itemPrice; // The += symbol adds the number on the right to the one on the left and updates the left number with the new total.
    }
    // 9. Display the total cost to the user formatted to two decimal places
    System.out.println("\nTotal cost of " + itemCount + " items: $" + String.format("%.2f", totalCost));
    // 10. Close the scanner
    scanner.close();
  }
}
