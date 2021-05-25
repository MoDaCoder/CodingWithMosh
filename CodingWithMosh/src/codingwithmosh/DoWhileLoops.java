package codingwithmosh;

import java.util.Scanner;

public class DoWhileLoops {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String keyWord = "";
        
//        while(!keyWord.equals("quit")){
//            System.out.println("What would you like to do: ");
//            keyWord = sc.next().toLowerCase();
//            System.out.print(keyWord);
//        }
        do { /*Runs the loop at least once even if while condition is met*/
            System.out.println("What would you like to do: ");
            keyWord = sc.next().toLowerCase();
            System.out.print(keyWord);
        }
        while(!keyWord.equals("quit"));
    }
}
