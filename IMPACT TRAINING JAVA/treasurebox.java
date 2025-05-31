import java.util.Scanner;

public class Main {
    
    // Method to find GCD of two numbers
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking three inputs
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Finding second largest number
        int secondLargest;
        if ((a > b && a < c) || (a > c && a < b)) {
            secondLargest = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            secondLargest = b;
        } else {
            secondLargest = c;
        }

        // Finding GCD of three numbers
        int gcd_ab = gcd(a, b);
        int gcd_abc = gcd(gcd_ab, c);

        // Output
        System.out.println("Second largest number (treasure box): " + secondLargest);
        System.out.println("Code to open the box (GCD): " + gcd_abc);

        sc.close();
    }
}