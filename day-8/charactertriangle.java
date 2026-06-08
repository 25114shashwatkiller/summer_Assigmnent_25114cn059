import java.util.Scanner;

public class charactertriangle 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}