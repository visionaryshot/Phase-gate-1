public class Taskten {
public static void main(String[] args){


int[] numbers = {51, 125, 13, 94, 31};
int max = numbers[0];
int min = numbers[0];

for (int counter = 1; counter < numbers.length; counter++) {
    if (numbers[counter] > max) {
        max = numbers[counter];
    }
    if (numbers[counter] < min) {
        min = numbers[counter];
    }
}
System.out.println("The Maximum number is : " + max);
System.out.println("the Minimum number is : " + min);
