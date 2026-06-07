import java.util.Scanner;
public class recursiveReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNum);
    }

    public static int reverseNumber(int num) {
        if (num < 10) {
            return num;
        }
        int lastDigit = num % 10;
        return lastDigit * (int) Math.pow(10, (int) Math.log10(num)) + reverseNumber(num / 10);
    }
}