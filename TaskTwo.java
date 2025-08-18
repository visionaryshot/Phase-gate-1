import java.util.Scanner;

public class TaskTwo {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


       
System.out.print("Enter first integer:");
int num1 = input.nextInt();


System.out.print("Enter second integer:");
int num2 = input.nextInt();


System.out.print("Enter third integer: ");
int num3 = input.nextInt();


    
int sum = num1 + num2 + num3;
int average = sum / 3;
int product = num1 * num2 * num3;


int smallest = Math.min(num1, Math.min(num2, num3));
int largest = Math.max(num1, Math.max(num2, num3));


System.out.println("The Sum is : " + sum);
System.out.println(" The Average is : " + average);


System.out.println("The Product is : " + product);
System.out.println(" The Smallest is : " + smallest);


System.out.println(" The Largest is : " + largest);
}
}
