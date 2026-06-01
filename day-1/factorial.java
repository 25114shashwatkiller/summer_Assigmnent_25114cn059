import java.util.Scanner;

public class factorial 
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find its factorial:");
    int n= sc.nextInt();
    double factorial = 1;

    for (int i = 1; i <= n; i++) {
        factorial =factorial *i;
    }

    System.out.println("Factorial of " + n + " is: " + factorial);
}
}
