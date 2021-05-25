package codingwithmosh;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int fizzbuzz;
        fizzbuzz = sc.nextInt();
        
        if(fizzbuzz % 5 == 0){
            if (fizzbuzz % 3 == 0)
                System.out.println("FIZZBUZZ!");
            else
                System.out.println("Fizz");
        }
        else if (fizzbuzz % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(fizzbuzz);
    }
    
}
