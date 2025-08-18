public class TaskSix {
public static void main(String[] args){



int[] numbers = {51, 125, 13, 94, 31};
int largest = numbers[0];



for (int counter = 1; counter < numbers.length; counter++) {
if (numbers[counter] > largest) {
largest = numbers[counter];


}
}


System.out.println("The Largest number is : " + largest);
