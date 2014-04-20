

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
	
	
	
}
