import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class Asserdemo
{
public void testforassertequal()
{
	int result=1;
	int expected=1;
	assertEquals(result,expected);
}
@Test
void testassertetrue() {
	assertTrue("hello".contains("i"));
}
@Test
void testnull() {
	String n=null;
	assertNull(" ");
}

	
	
	
	
}
