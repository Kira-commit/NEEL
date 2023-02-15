package array;

public class Ex71DString 
{
	public static void main(String[] args)
	{
		String [][] ar= {{"KAvya","Nita","Rani"},{"Vaibhav","Pratik","Om"}};
		System.out.println(ar.length);
		System.out.println(ar[1][2]);
		System.out.println("..................");
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
