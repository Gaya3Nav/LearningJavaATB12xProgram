package ex_01_Java_Basics;

import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        System.out.println("Enter a persons age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String person = age > 18 ? (age>65? "Adult - Senior Citizen":"Adult - Major"): "Minor";
                System.out.println(person);
    }
}
