package Inerface_implementation;

public class TestClassI1_I2 implements I1,I2
{
	public void m1()
	{
		System.out.println("Running interface I1 in IC");
	}

	public void m2()
	{
		System.out.println("Ruuning m2");
	}
	public void m3()
	{
		System.out.println("running m3");
	}
	public void m4()
	{
		System.out.println("running m4");
	}
	public static void main(String[] args) 
	{
		TestClassI1_I2 g= new TestClassI1_I2();
		g.m1();
		g.m2();
		g.m3();
		g.m4();
		
	}
}
