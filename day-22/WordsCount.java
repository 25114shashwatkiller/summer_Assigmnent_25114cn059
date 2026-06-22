import java.util.Scanner;

//DEFINE CLASS
public class WordsCount {
    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = num.nextLine();
        // TO STORE STRING AS ARRAY OF CHARACTERS
        char[] a = str.toCharArray();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ' || a[i] == '\t') {
                count++;
            }

        }
        System.out.print("Number of words = " + (count + 1));

        num.close();
    }

}