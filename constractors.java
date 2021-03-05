package coding;

class a
{
	public a()
	{
		System.out.println("bhanu");
		
	}
	public a(int i)
	{
	     System.out.println(i);
	}
}                                       //method overriding
class b extends a
{
	public b(int i)
	{
		super(i);
		System.out.print("pavi");
	}
}
public class constractors {
	public static void main(String args[])
	{
		b obj=new b(5);
		
		
	}
	

}
