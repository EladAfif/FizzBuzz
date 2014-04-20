import static org.junit.Assert.*;

import org.junit.Test;


public class fizzbazzTest {

	fizzbazz fizz = new fizzbazz();
	@Test
	public void testInit() 
	{
		fizz.initArray();
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			//System.out.println(fizz.a[i]);
			if(fizz.a[i].equals(i))
				fail();
			
		}
	}
	@Test
	public void testIsFizz() 
	{
		fizz.isFizz();
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			if(i%3 == 0)
			//System.out.println(fizz.a[i]);
				if(fizz.a[i] != "Fizz")
					fail();
				else 
					System.out.println(fizz.a[i]);
		}
	}
	
	@Test
	public void testIsBuzz() 
	{
		fizz.isBuzz();
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			if(i%5 == 0)
			//System.out.println(fizz.a[i]);
				if(fizz.a[i] != "Buzz")
					fail();
				else 
					System.out.println(fizz.a[i]);
		}
	}
	
		
	

}
