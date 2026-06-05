import java.util.Scanner;
public class largestprime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int largestPrime = -1;
        
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime(i)) 
            {
                largestPrime = i;
            }
        }
        
        if (largestPrime >= -1) 
        {
            System.out.println("The largest prime number  " + n + " is: " + largestPrime);
        } else {
            System.out.println("There are no prime numbers   " + n);
        }
        
        sc.close();
    }
    
    public static boolean isPrime(int num) 
    {
        if (num <= 1)
             return false;
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
                return false;
        }
        return true;
    }
}
 