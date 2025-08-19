import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AgeCalculatorTest {
@Test
public static int difference(int fatherAge, int sonAge) {
return (fatherAge - 2 * sonAge);
}

//Arrange
int fatherAge = 50;
int sonAge =22;
// Act
Calculator calculator = new Calculator ();
int result = calculator.difference(fathersAge , sonAge);
//Assert
assertEquals(result,6 );
}

public class AgeCalculatorTest {
@Test
public static int difference(int fatherAge, int sonAge) {
return (fatherAge - 2 * sonAge);
}

//Arrange
int fatherAge = 50;
int sonAge =22;
// Act
Calculator calculator = new Calculator ();
int result = calculator.difference(fathersAge , sonAge);
//Assert
assertNotEquals(result,66 );
}
