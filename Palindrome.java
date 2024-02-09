package week1.day2;

public class Palindrome {

	public static void main(String[] args) 
    {
       
        int n=547,a=0,remainder=0; 
        int temp = n;
        for(n=547;n>0;n/=10)
        {
            remainder= n % 10;
            a = (a * 10) + remainder;
            
        }

        if (temp == a)
        {
            System.out.println("Yes, the given number " + temp + " is a palindrome.");
        }

        else
        {
           System.out.println("No, the given number " + temp + " is not a palindrome.");
        }
    }
}
