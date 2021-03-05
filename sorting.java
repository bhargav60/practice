package coding;
import java.util.*;
public class sorting {
	public static void main(String args[])
	{
		int[] arr= {3,9,2,6,4,2};
		String[] str= {"pavi","bhanu","krishna","greeshu","akhil"};
		Arrays.sort(arr);
		Arrays.sort(str);

		for(int b:arr)
		{
			System.out.print(b+" ");//arraysorting
		}
		for(String c:str)
		{
			System.out.print(c+" ");
		}
		
		
	}

}
