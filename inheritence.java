package coding;

class inheritence {
	 public int add(int i,int j)
	 {
		   
			System.out.println(i+j);
            return i+j;
	 }

}
class clcadv extends inheritence
{	public int sub(int i,int j)
	{
	  System.out.println(i-j);
	return i-j;
	}
}
class inheritencedemo
{
      public static void main(String args[])
{
      clcadv c=new clcadv();
	int results=c.add(5, 4);
	int results2=c.sub(6, 3);
	System.out.println(results);
	System.out.print(results2);
}
}