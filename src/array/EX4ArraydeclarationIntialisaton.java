package array;

import java.util.Arrays;

public class EX4ArraydeclarationIntialisaton 
{
	public static void main(String[] args)
	{
		int [] ar={80,48,73,27,40,36 };
		System.out.println(ar.length);
		System.out.println(ar[2]);
		System.out.println("..............................");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("::::::::::::::::::::::::::;");
		for (int j=ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
		System.out.println("........Ascending>........");
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(",,,,,,,,,,,Descending,,,,,,,,,,,,");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
	

}
