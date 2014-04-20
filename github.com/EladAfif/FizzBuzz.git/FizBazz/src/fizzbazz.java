import static org.junit.Assert.fail;



public class fizzbazz {
	
	public String a[];

	
	public fizzbazz()
	{ 
		a = new String[100];
	}
	
	public void initArray()
	{
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			a[i] = Integer.toString(i);
		}
	}
	
	public void isFizz()
	{
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			if(i % 3 == 0)
				a[i] = "Fizz";
		}
	}
	
	public void isBuzz()
	{
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			if(i % 5 == 0)
				a[i] = "Buzz";
		}
	}
	
	public void isFizzBuzz()
	{
		int i;
		for (i = 0 ; i < 100 ; i++)
		{
			if(i % 5 == 0 && i % 3 == 0)
				a[i] = "FizzBuzz";
		}
	}
	
	
	
}
