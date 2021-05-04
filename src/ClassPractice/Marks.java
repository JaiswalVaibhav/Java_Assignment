package ClassPractice;

public class Marks {
    public static void main(String[] args) {
        int english = 81, hindi = 85, marathi = 82, math = 97, science = 90, history = 75;
        int total, ave;
        total = english + hindi + marathi + math + science + history;
        System.out.println("Total marks obtained --> " + total);
        ave = (english + hindi + marathi + math + science + history) / 6;
        System.out.println("Average marks obtained --> " + ave);
    }
}
