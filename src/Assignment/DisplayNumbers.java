package Assignment;

public class DisplayNumbers {
    public static void main(String[] args) {
        int num;
        for (num = 100; num <= 200; num++) {
            if (num % 10 != 7) {
                System.out.println(num);
            }
        }
    }


}
