package coding;
import java.util.*;

public class bh {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	String str="bhanu is a good boy";
	String[] a=new String[100]; 
         a=str.split(" ");
	//int n=str.length();
	for(int i=0;i<=str.length();i++)
			{
			  System.out.println(a[i]);
		
			}
	    
	    //System.out.println(a[4]);
	    s.close();
	}
}
