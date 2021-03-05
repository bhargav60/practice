package coding;
import java.util.*;
public class remove_charcter_word {
	public static void main(String args[])
	{
          Scanner s=new Scanner(System.in);
          String str=s.nextLine();

          String a=str.replaceAll("boy", "");
               System.out.println(a);
          char[] ch=str.toCharArray();
          char c='a';
          for(int i=0;i<ch.length;i++)
          {
             if(ch[i]==c)
             {
            	 continue;
            	 //System.out.print(ch[i]);
             }             
             else
             {
            	 System.out.print(ch[i]);

             }
          }
    	  System.out.println();
          s.close();
          }
	}


