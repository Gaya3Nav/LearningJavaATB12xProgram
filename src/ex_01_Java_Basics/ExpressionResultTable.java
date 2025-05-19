package ex_01_Java_Basics;

public class ExpressionResultTable {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; //pre-increment
        System.out.println(a);
        System.out.println(b);

        //Expression result table
        // line no | a | Result (b)
        //    5 | 10 | NA
        //    6 | 11 | 11
        //    7 | 11 - printing | 11
        //    7 | 11 - | 11 - printing

        int c = 10;
        int d = c++; //post-increment
        System.out.println(c);
        System.out.println(d);

        int e = 10;
      //  System.out.println(++e + e);
        System.out.println(e++ + e);

        int f = 10;
        System.out.println("Expression value "+ (f++ + ++f));//(10 , 11, 12)
        System.out.println(f);

        int g = 10;
        System.out.println("Expression value "+ (++g + ++g));//(11 + 12 =23)
        System.out.println(g);// 12
    }
}
