import java.util.Scanner;

//DEFINE CLASS
public class ReverseString {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = num.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();

        System.out.print("Reversed String : ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }

        num.close();
    }
}