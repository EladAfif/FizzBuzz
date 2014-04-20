import static org.junit.Assert.*;

import org.junit.Test;


public class fizzbazzTest {

	fizzbazz fizz = new fizzbazz();
	@Test
	public void testInit() {
		fizz.initArray();
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			//System.out.println(fizz.a[i]);
			if(fizz.a[i].equals(i))
				fail();
			
		}
		
		
		
		
	}

}
