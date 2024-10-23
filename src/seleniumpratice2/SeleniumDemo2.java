package seleniumpratice2;

public class SeleniumDemo2 
{

	public static void main(String[] args) 
	{
		SeleniumDemo2 s1 = new SeleniumDemo2();
		s1.funA(10);
		int b = 20;
		s1.funA(b);
		s1.funA(s1.funB());

	}
    public void funA(int a)
    {
    	
    }
    public int funB()
    {
    	return 20;
    }
}
