import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class testassumption 
{
@Test
void testassumption()
{
	int a=10,b=10;
	Assumptions.assumingThat(a==b,()-> {System.out.println("test");});
}
}
