package ClassPractice;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int guess, num, i = 0;
        Scanner scanner = new Scanner(System.in);
        num = (int) (Math.random() * 100 + 1);

        do {
            System.out.println("Guess the number");
            guess = scanner.nextInt();
            ++i;
            if (guess > num) {
                System.out.println("Your guess is high");
            } else if (guess < guess) {
                System.out.println("your guess is low");
            } else {
                System.out.println("Your guess is correct and trials" + i);
            }
        } while (guess != num);


    }
}
