package ClassPractice;

public class NumArrange1 {
    public static void main(String[] args) {
        int l=0;
        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i+l;k++){
                System.out.print(i);

            }l++;
            System.out.println();
        }
    }
}
