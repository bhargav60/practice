package coding;


import java.util.Scanner;

public class fibanacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
          int n=s.nextInt();
          int a=0;
          int b=1;
          System.out.print(a+" "+b+" ");

          int temp;
          for(int i=b;i<=n;i++)
          {
        	   temp=a+b;
               System.out.print(temp+" ");
        	   a=b;
        	   b=temp;
        	  
          }
          s.close();
	}

}
