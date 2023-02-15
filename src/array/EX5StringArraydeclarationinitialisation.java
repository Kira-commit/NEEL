package array;

import java.util.Arrays;

public class EX5StringArraydeclarationinitialisation
{
	public static void main(String[] args) 
	{
		String [] ar= {"Juhi","Krutika","Shrutika","Diksha","Lena"};
		System.out.println(ar.length);
		System.out.println(ar[2]);
		System.out.println("................");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(".................");
		for(int i=ar.length-1;i>=0;i--) 
		{
		System.out.println(ar[i]);	
		}
		System.out.println(".............");
		Arrays.sort(ar);
		for(int j=0;j<=ar.length-1;j++)
		{
			System.out.println(ar[j]);
		}
		System.out.println(">.........Desc..........");
		for(int j=ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
	}

}
