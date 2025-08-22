import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {

   
 public static ArrayList<String> groceryList = new ArrayList<>();

 public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int userinput;

do {
System.out.println("""
                 
WELCOME TO OUR VVIP SERVICE (YOUR LUXURY GROCERIES DEY HERE)

              1-> Add Item
              2-> Remove Item
              3-> Show All Items
              4-> Exit
              """);
userinput = scanner.nextInt();
scanner.nextLine(); 

switch (userinput) {
case 1:
String itemToAdd = scanner.nextLine();
GoToAddItem(itemToAdd);
break;
case 2:
String itemToRemove = scanner.nextLine();
GoToRemoveItem(itemToRemove);
break;
case 3:
GoToShowAllItems();
break;
case 4:
GoToExit();
break;
default:System.out.println("Wrong input, please try again.");
}

} while (userinput != 4);
}

public static void GoToAddItem(String item) {
groceryList.add(item);
System.out.println(item + " added");
}

public static void GoToRemoveItem(String item) {
if (groceryList.remove(item)) {
System.out.println(item + " removed");
}
else {
System.out.println("Item not found.");
}
}

public static void GoToShowAllItems() {
System.out.println("Show All Items:");
for (int counter = 0; counter < groceryList.size(); counter++) {
System.out.println((counter + 1) + ". " + groceryList.get(counter));
}
}

public static void GoToExit() {
System.out.println("bye - bye!");
 }
}