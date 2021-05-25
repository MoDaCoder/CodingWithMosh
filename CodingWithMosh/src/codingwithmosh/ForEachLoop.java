package codingwithmosh;

public class ForEachLoop {
    
    public static void main(String[] args){
        
        String[] fruits = {"Apples", "Bananas", "Peaches"};
        
        for(int i = fruits.length; i > 0; i--)
            System.out.println(i);
        
        /*For each loop can't iterate backwards, it can't access a specific index in the array and can only move forward*/
        /*Unless you need to do any of these things it is easier to use a for each loop*/
        for(String fruit : fruits)
            System.out.println(fruit);
    }  
}
