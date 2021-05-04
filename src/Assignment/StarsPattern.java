package Assignment;

public class StarsPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i != 2 && i != 3) {
                for (int j = 1; j <= 6; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*    *");
            }
            System.out.println();
        }

    }
}
