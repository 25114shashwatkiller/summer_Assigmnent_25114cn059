import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("Decimal value: " + decimalValue);
        sc.close();
    }
}