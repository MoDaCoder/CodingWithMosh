package codingwithmosh;
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args){
        
        String chooseRole = "What number are you: "; /*How do I add a string before the input?*/
        System.out.print(chooseRole);
        
        Scanner sc = new Scanner(System.in);
        int role = sc.nextInt();
        
        switch (role){ /*Won't allow strings in J7*/
        case 1:
            System.out.println("Leader");
            break;
        case 2:
            System.out.println("Moderator");
            break;
        default: 
            System.out.println("Guest");
        }
    }
}