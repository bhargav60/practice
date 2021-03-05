package coding;

public class factorial {
	public static void main(String args[])
	{
	int n=10;
	int fact=1;
	System.out.println("factors of "+n+"=");
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
		}
		else
			continue;
	}
	for(int i=1;i<=n;i++)
	{
		
		fact=fact*i;
		
	}
	System.out.print("factorial of "+n+"="+fact);
  }

}
