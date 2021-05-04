package examples;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0] = 55;
        marks[1] = 88;
        marks[2] = 99;
        marks[3] = 77;
        System.out.println("Using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        float [] percentage;
        percentage = new float[4];
        percentage[0] = 88.3f;
        percentage[1] = 76.5f;
        percentage[2] = 93.56f;
        percentage[3] = 84.5f;
        System.out.println("Using for loop");
        for (int i =0;i<percentage.length;i++){
            System.out.println(percentage[i]);
        }

        int [] num = {1,22,54,68,90,676};
        System.out.println("Using for each loop");
        for (int element : num){
            System.out.println(element);
        }
    }
}
