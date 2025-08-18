public class WorldPopulation {
public static void main(String[] args) {

long currentPopulation = 83100000000; 
float growthRate = 0.00836;

int population = currentPopulation;
System.out.println("Year    Population           Increase");

for (int year = 1; year <= 75; year++) {
float increase = population * growthRate;
population += increase;
System.out.println(year + "  " + (long)population + "  " + (long)increase);
}
}
}
