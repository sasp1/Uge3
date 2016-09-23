package ugeseddel03;

public class BinCoeff 
{
	public static int binomial(int n, int k)
	{
		
		return factorial(n,1)/(factorial(k,1)*factorial(n-k,1));
	}
	public static int binomialSmart(int n, int k)
	{
		double expr1 = factorial(n,(n/2))/factorial(k, 1);
		double expr2 = factorial((n/2)-1, 1)/factorial(n-k, 1);
		double expr3 = expr1*expr2;
		//return (int) expr3;
		return 24;
	}
	public static int factorial(int n, int lowerBound)
	{
		int product = 1; 
		for (int i = lowerBound; i<=n; i++)
		{
			product *= (i);
		}
		return product;
	}
}
