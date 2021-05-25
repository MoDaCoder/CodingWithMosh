package codingwithmosh;
import java.util.Scanner;

public class WhileLoops {
    
    public static void main(String[] args){
//        int i = 0;
//        while(i <= 5){
//            System.out.println("Doing while loop!");
//            i++;
//        }
        
        Scanner sc = new Scanner(System.in);
        String keyWord = "";
        while(!keyWord.equals("quit"))
            System.out.println("What would you like to do: ");
            keyWord = sc.next().toLowerCase();
            System.out.println(keyWord);
    }
}
