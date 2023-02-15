package array;

public class E1_Arrayint 
{
	public static void main(String[] args) 
	{
		
	
	int [] ar= new int[4];
	ar[0]=29;
	ar[1]=38;
	ar[2]=32;
	ar[3]=43;
	
	System.out.println(ar[3]);
	System.out.println(ar.length);
	System.out.println(".........................................");
	for(int i=0;i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
	System.out.println(".................................................");
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	}
}
