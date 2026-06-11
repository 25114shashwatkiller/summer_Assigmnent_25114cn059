import java.util.Scanner;

public class funmaxtwonumbers {

     public static int findmax(int a, int b)
      {
        return (a*b);  // here if write maths.pow(a,b) then it wil return greatests among the two numbers
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        int max = findmax(num1, num2);
        System.out.println("The maximum of the two numbers is: " + max);
    }
}



   