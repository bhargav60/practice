package coding;

class d
{
	public void show()
	{
		System.out.print("bhanu");
	}
}
class c extends d
{
	
	public void show()
	{
		super.show();// super keyword is we uses to show the class a content
	System.out.print("pavi");
}
}
public class overrididng {
    public static void main(String args[])
    {
    	c obj=new c();
    	obj.show();
    }

}
