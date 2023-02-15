package array;

import java.util.Arrays;

public class E2_arrayString
{
	public static void main(String[] args) 
	{
		String [] obj =new String[6];
		obj[0]="K";
		obj[1]="i";
		obj[2]="r";
		obj[3]="a";
		obj[4]="n";
		obj[5]="N";
		
		System.out.println(obj.length);
	    System.out.println(obj[4]);
	    System.out.println("..................................");
		for(int i=0;i<=5;i++) 
		{
			System.out.println(obj[i]);
		}
		System.out.println("'''''''''''''''''''");
		for(int i=obj.length-1;i>=0;i--)
		{
			System.out.println(obj[i]);
		}
		System.out.println("/////////////////////////////////////////////");
		Arrays.sort(obj);
		for( int i=0;i<=obj.length-1;i++)
		{
			System.out.println(obj[i]);
		}
		System.out.println("............................");
		for (int j=obj.length-1;j>=0;j--)
		{
			System.out.println(obj[j]);
		}
	}

}
