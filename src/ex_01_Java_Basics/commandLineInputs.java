package ex_01_Java_Basics;

public class commandLineInputs {
    public static void main(String[] args) {
        String user_input = args[0];
        int age = Integer.parseInt(user_input); //NumberFormatException if other datatype is passed
        System.out.println(user_input instanceof String);

        System.out.println("User input is : "+user_input);
        String person = age > 18 ? (age>65? "Adult - Senior Citizen":"Adult - Major"): "Minor";
        System.out.println(person);

    }
}
