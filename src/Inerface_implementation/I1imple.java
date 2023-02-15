package Inerface_implementation;

public class I1imple implements I1
{ 
	public void m1()
	{
		System.out.println("RUNNING METHOD M1");
	}
	public void m2()
	{
		System.out.println("Running method m2");
	}
	public void m3()
	{
		System.out.println("Running method m3");
	}
	public static void main(String[] args) 
	{
		I1imple d= new I1imple();
		d.m1();
		d.m2();
		d.m3();
		
	}

}
