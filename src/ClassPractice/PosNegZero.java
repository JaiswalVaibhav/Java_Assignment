package ClassPractice;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Number is Positive");
        }
        if (num < 0) {
            System.out.println("Number is Negative");
        }
        if (num == 0) {
            System.out.println("Number is Zero");
        }
    }
}
