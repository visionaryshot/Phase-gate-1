public class TaskSeven {
public static void main(String[] args){



int[] numbers = {51, 125, 13, 94, 31};
int smallest = numbers[0];



for (int counter = 1; counter < numbers.length; counter++) {
if (numbers[counter] < largest) {
smallest = numbers[counter];


}
}


System.out.println("The Smallest number is : " + smallest);
