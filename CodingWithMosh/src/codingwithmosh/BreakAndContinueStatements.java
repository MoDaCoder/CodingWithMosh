package codingwithmosh;

import java.util.Scanner;

public class BreakAndContinueStatements {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String keyWord = "";
//            while(!keyWord.equals("quit")){
//                System.out.println("What would you like to do: ");
//                keyWord = sc.next().toLowerCase();
//                if(!keyWord.equals("quit")){
//                    System.out.print(keyWord);
//                }
//            }
            while(true){
                System.out.print("What would you like to do: ");
                keyWord = sc.next().toLowerCase();
                if(keyWord.equals("pass"))
                    continue;
                if(keyWord.equals("quit"))
                    break;
                System.out.println(keyWord);
            }
    }
}
