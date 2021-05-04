package Assignment;

public class NumbersArrangement3 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
