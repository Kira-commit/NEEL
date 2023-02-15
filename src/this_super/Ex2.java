package this_super;

public class Ex2 extends Ex1
{
	int a=50;
	public void m1()
	{
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		Ex2 f= new Ex2();
		f.m1();
		
		
	}

}
