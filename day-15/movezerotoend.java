import java.util.Scanner;

public class movezerotoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroToEnd(arr);
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; 
            }
        }
        while (count < arr.length) {
            arr[count++] = 0; 
        }
    }
}