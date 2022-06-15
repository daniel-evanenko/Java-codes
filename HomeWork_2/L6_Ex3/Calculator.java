package L6_Ex3;

public class Calculator
{
	public void addFunc(double a , double b)
	{
		System.out.format(a+"+"+b+" = %.2f\n",(a+b));
	}
	
	public void addFunc(int a , int b)
	{
		System.out.println(a+"+"+b+" = "+(a+b));
	}
	
	public void subFunc(double a , double b)
	{
		System.out.format(a+"-"+b+" = %.2f\n",(a-b)); 
	}
	
	public void subFunc(int a , int b)
	{
		System.out.println(a+"-"+b+" = "+(a-b));
	}
	
	public void multiplication(int a,int b)
	{
		System.out.println(a+"*"+b+" = "+(a*b));
	}
	
	public void multiplication(double a,double b)
	{
		System.out.println(a+"*"+b+" = "+(a*b));
	}
	
	public void division(int a,int b)
	{
		System.out.println(a+"%"+b+" = "+(a/b));
	}
	
	public void division(double a,double b)
	{
		System.out.println(a+"%"+b+" = "+(a/b)); // having a problem with foramt
	}
	
	public void power(int a, int b)
	{
		System.out.println(a+"^"+b+" = "+Math.pow(a, b));
	}
	
	public void power(double a, double b)
	{
		System.out.format(a+"^"+b+" = %.2f\n",Math.pow(a, b));
	}
	
    public boolean isPower(int x, int y)
    {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);
 
        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y)
            pow = pow * x;
 
        // Check if power of x becomes y
        return (pow == y);
    }
	public void sumDigits(int a)
	{
		int sum=0;
		System.out.print("the sum of the digits of the number "+a);
		if(a<0)
			a=Math.abs(a);
		while(a>0)
		{
			sum+=a%10;
			a/=10;
		}
		System.out.println(" is = "+sum);
	}
	
}
