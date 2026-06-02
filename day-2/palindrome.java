import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        int temp = n;
        int rev = 0;

        while(temp>0)
        {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        if(n == rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}
      