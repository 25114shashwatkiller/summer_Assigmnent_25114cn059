import java.util.Scanner;

//DEFINE CLASS
public class numGUESSgame {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter unknown number : ");
        int n = num.nextInt();
        int a;
        do {
            System.out.print("guess the number : ");
            a = num.nextInt();

            if (a > n) {
                System.out.print(" greater.");
            } else if (a < n) {
                System.out.print(" smaller ");
            } else {
                System.out.print("Welldone ! correct choice .");
            }

        } while (a != n);

        num.close();
    }
}