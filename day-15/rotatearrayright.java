import java.util.Scanner;

public class rotatearrayright {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of positions to rotate:");
        int k = sc.nextInt();
        rotateRight(arr, k);
        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}