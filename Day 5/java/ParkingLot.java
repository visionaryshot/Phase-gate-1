import java.util.Scanner;
public class ParkingLot {

public static int[] slots = new int[20];
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
int userinput;

do {
System.out.println("""
WELCOME TO OUR VVIP PARKING SERVICE

Our Parking Lot Menu:
 
1->  Park a car
2->  Remove a car
3->  Show parking status
4->  Exit
""");

userinput = scanner.nextInt();

switch (userinput) {
case 1:parkACar();break;

case 2:System.out.print("Enter any slot number to remove car (1-20): ");
int slot = scanner.nextInt();
removeACar(slot - 1);break;

case 3:showParkingStatus();break;

case 4:System.out.println("bye - bye");break;

default:System.out.println("Invalid input");
}

} while (userinput != 4);
}

public static void parkACar() {
for (int counter = 0; counter < slots.length; counter++) {
if (slots[counter] == 0) {
slots[counter] = 1;
System.out.println("You dey park for slot: " + (counter + 1));
return;
}
}
System.out.println("Our Parking lot is full. \nApply for regular.");
}

public static void removeACar(int counter) {
if (counter >= 0 && counter < slots.length) {
if (slots[counter] == 1) {
slots[counter] = 0;
System.out.println("Car removed from slot " + (counter + 1));
}
 else {
System.out.println("Slot is empty.");
}
}
 else {
System.out.println("Invalid slot number.");
}
}

public static void showParkingStatus() {
System.out.println("Our  Parking Status:");
for (int count = 0; count < slots.length; count++) {
System.out.println("Slot " + (count + 1) + ": " + (slots[count] == 1 ? "Occupied" : "Empty"));
}
}
}
