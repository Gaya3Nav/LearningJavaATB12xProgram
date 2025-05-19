package ex_01_Java_Basics;

public class maxThree {
    public static void main(String[] args) {
        int a = -32;
        int b = 20;
        int c = -87;

        int greatest = (a>b)? (a>c ? a:c) : (b>c ? b : c);
        System.out.println(greatest);
    }
}
