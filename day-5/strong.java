import java.util.Scanner;

public class strong 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum =sum + factorial(digit);
            temp =temp / 10;
        }
        
        if (sum == num) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
        
        sc.close();
    }
    
    public static int factorial(int n) 
    {
        int fact = 1;
        for (int i = 1; i <= n; i++) 
            {
            fact = fact * i;
        }
        return fact;
    }
}