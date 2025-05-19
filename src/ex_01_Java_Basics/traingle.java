package ex_01_Java_Basics;

import java.util.Scanner;

public class traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st angle");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd angle");
        int n2 = sc.nextInt();
        System.out.println("Enter 3rd angle");
        int n3 = sc.nextInt();

if ((n1+n2+n3) == 180 && (n1 >0 && n2 > 0 && n3 >0)){
        if(n1 < 90 && n2 < 90 && n3 < 90){
            System.out.println("Acute triangle");
        }else if (n1 > 90 || n2>90 || n3>90){
            System.out.println("Obtuse triangle");
        }else if (n1 == 90 || n2==90 || n3==90){
            System.out.println("Right angle triangle");
        }}else
        {
            System.out.println("Invalid inputs");
        }
        sc.close();
    }

}
