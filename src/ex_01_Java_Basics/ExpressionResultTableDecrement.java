package ex_01_Java_Basics;

public class ExpressionResultTableDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = --a; //pre-increment
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----------------------");


        int c = 10;
        int d = c--; //post-increment
        System.out.println(c);
        System.out.println(d);

        System.out.println("-----------------------");
        int e = 10;
      //  System.out.println(++e + e);
        System.out.println(e-- + e);

        System.out.println("-----------------------");
        int f = 10;
        System.out.println("Expression value "+ (f-- + --f));//(10 , 11, 12)
        System.out.println(f);

        System.out.println("-----------------------");
        int g = 10;
        System.out.println("Expression value "+ (--g + --g));//(11 + 12 =23)
        System.out.println(g);// 12
    }
}
