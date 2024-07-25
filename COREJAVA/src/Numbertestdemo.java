import static org.junit.jupiter.api.Assertions.assertEquals;

public class Numbertestdemo
{
void factorialtest()
{
	int exp=120;
	int act=NumberFunction.getfactorial(5);
	assertEquals(exp,act);
}
}
