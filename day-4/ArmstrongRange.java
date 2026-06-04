import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++)
             {
            int temp = num;
            int digits = 0;
            int sum = 0;

            
            for (int n = temp; n > 0; n /= 10) 
                {
                digits++;
            }

            
            for (int n = temp; n > 0; n /= 10) {
                int digit = n % 10;
                sum = sum + (int) Math.pow(digit, digits);
            }

            if (sum == num) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}