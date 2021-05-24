package codingwithmosh;

import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer temp = sc.nextInt();

        if (temp > 30) {
            System.out.println("It's a hot day!");
            System.out.println("Drink water.");
        } 
        else if (temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day!");
            System.out.println("Wear a sweater.");
    }
}
