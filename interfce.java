package coding;

interface ab
{
	public void show();
}
class child implements ab
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print("bhanu");
		
	}
	
}

public class interfce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ab obj= new child();
		obj.show();

	}

}
