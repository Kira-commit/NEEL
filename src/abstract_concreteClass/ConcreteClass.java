package abstract_concreteClass;

public class ConcreteClass extends AbstractClass
{
	
		public void m3()
		{
			System.out.println("Running method m3");
		}
		public void m4()
		{
			System.out.println("Running method m4");
		}
	public static void main(String[] args)
	{
		ConcreteClass oj=new ConcreteClass();
				oj.m1();
				oj.m2();
				oj.m3();
				oj.m4();
				
		
	}	
	

}
