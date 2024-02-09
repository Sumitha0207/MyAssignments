package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) 
	{
		int n=10;
		int count=0;
		for (int i=2;i<=n-1;i++)
		{
			if (n%i==0)
			{
				count++;
		}
		}
		if(count<1)
		{
			System.out.println("Given number is prime number : "+ n);
		}
		else 
		{
			System.out.println("Given number is not prime number : "+ n);
		}
	}
	}



