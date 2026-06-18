import java.util.Scanner;

//define class
public class SelectionSort {

    // USER DEFINED FUNCTION for Selection Sort
    static void SelectionSort(int a[], int n) {
        int temp, min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                    min = j;
            }

            if (min != i) {
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }

    }

    // USER DEFINED FUNCTION FOR PRINTING ARRAY
    static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\s\s\s");
        }
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of an Array : ");
        int n = num.nextInt();
        int[] a = new int[n];
        // loop to input elements of an array
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");

            a[i] = num.nextInt();
        }
        // PRINT UNSORTED ARRAY
        System.out.println("UNSORTED ARRAY : ");
        print(a, n);
        System.out.println();
        // FUNCTION CALL FOR SORTING
        SelectionSort(a, n);
        // PRINT SORTED ARRAY
        System.out.println("SORTED ARRAY : ");
        print(a, n);

        num.close();
    }

}