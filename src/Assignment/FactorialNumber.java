package Assignment;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int num, j, fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();
        for (j = 1; j <= num; j++) {
            fact = fact * j;
        }
        System.out.println(fact);
    }
}
