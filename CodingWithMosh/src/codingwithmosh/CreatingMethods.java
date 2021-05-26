package codingwithmosh;

import java.util.Scanner;

public class CreatingMethods {
    
    
    
    public static void main(String[] args){
        System.out.println("What is your name?");
//        greetUser();
//        greetUser("Guillermo", "Martinez");
      String greetings = greetUser("Guillermo", "Martinez");
      System.out.println(greetings);
    }
    
//    public static void greetUser(){
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Hello " + name);
//    }
    
//    public static void greetUser(String firstName, String lastName){
//        System.out.println("Hello " + firstName + " " + lastName);
//    }
    
    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }

}
