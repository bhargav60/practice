package coding;
import java.util.*;

public class primenum {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
				temp=temp+1;
			    
			
		}
		if(temp==0)
			System.out.print(n+" is prime num");
		else
			System.out.print("not a prime");
		s.close();
	}

}
