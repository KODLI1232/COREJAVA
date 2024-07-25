
public class NumberFunction
{
public static int getfactorial(int n)
{
	int i=1;
	while(n!=0) 
	{
		i=i*n;
		if(n<0)
			n++;
		else
			n--;
		
	}
	return i;
}
}
