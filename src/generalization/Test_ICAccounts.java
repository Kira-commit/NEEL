package generalization;

public class Test_ICAccounts 
{
	public static void main(String[] args)
	{
		Current t= new Current();
		t.CD();
		t.CW();
		t.MT();
		t.l();
		System.out.println("....................................................");
		Savings s=new Savings();
		s.CD();
		s.CW();
		s.MT();
		s.M();
		System.out.println("........................................");
		Salary y=new Salary();
		y.CD();
		y.CW();
		y.MT();
		y.N();
	}

}
