package Assignment;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i, j, flag = 0;
        System.out.println("Enter the Number");
        num = scanner.nextInt();
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (i = 2; i < num; i++) {
                j = num % i;
                if (j == 0) {
                    System.out.println(num + " is not a prime number");
                    flag = 1;
                    break;
                }
            }


            if (flag == 0) {
                System.out.println(num + " is a prime number");
            }
        }


    }
}
