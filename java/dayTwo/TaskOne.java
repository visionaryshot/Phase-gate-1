public class TaskOne {
public static int AgeDifference(int fatherAge, int sonAge) {
int years = (fatherAge - 2* sonAge);
return years;
}
public static void main(String[] args) {
System.out.println(AgeDifference(50, 22));
}
}
