//import static org.junit.jupiter.api.DynamicTest.stream;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
public class Helloworld
{
	@Test
void print()
{
	System.out.println("hello");

}
	@Test
void show() {
	
	System.out.println("welcome");
}
@RepeatedTest(3)
@Test
void display()
{
	System.out.println("helloworld");
}
}
