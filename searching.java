package coding;

public class searching {
	public static void main(String args[])
	{
		int[] a= {25,15,42,98,12,24,11};
		int key=11;
		for(int i=0;i<a.length;i++ )//linear searching
		{
			if(key==a[i]) {
			  System.out.print("element found "+ key);
			  break;
			}
			else {
				System.out.println("element not found");
 			}
		}
		
	}

}
