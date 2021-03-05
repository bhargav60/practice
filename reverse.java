package coding;

public class reverse {
	public static void main(String args[])
	{
		int n= 568647;
		String str = "abc";
		String s;
		char[] c=str.toCharArray();
		int rev=0;
		while(n>0)
		{
			
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
		for(int i=str.length()-1;i>=0;i--)
		{
			s=Character.toString(c[i]);
		    System.out.print(s);
		}
				
		/*if(s==str)
		{
			System.out.print("pallindorm");

		}
		else
		{
			System.out.print("not palindorm");

		}*/
		}
	}


