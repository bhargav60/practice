package coding;

abstract class human
{
	 abstract void eat();
	
	public void walk()
	{
		
	}
}
class Man extends human
{
	public void eat()
	{
		
		System.out.print("eating");
	}
}
public class abstarct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           human obj=new Man();
           obj.eat();
           
	}

}
