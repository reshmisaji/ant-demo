package AntDemo;


import java.util.Scanner;

public class Exception {
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }
}
