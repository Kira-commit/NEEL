package array;

public class Ex61D
{
	public static void main(String[] args)
	{
		
	
	int[][] ar= {{20,46,75} , {74,83,62}};
	System.out.println(ar.length);
	System.out.println(ar[0][1]);
	
	System.out.println("................");
	for(int i=0;i<=1;i++)
	{
		
		for(int j=0;j<=2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	}
	
	

	
}
