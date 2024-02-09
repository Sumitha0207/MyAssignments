package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int a=0,n=10,b=1,c;
		System.out.println("Fibonacci series are as follows");
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
