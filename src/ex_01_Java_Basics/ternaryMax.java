package ex_01_Java_Basics;

public class ternaryMax {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int max = (a>b) ? a : b;
        String whichIsGreater =  (a > b) ? "a is greater" : "b is greater";
        System.out.println(whichIsGreater);
        System.out.println(max);


    }
}
