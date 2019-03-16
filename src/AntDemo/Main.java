package AntDemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Divident:");
        int divident = scanner.nextInt();
        System.out.println("Enter the divisor:");
        int divisor = scanner.nextInt();
        int quotient = Exception.divide(divident, divisor);

        System.out.println("Quotient of the division process is :" + quotient);
    }
}
