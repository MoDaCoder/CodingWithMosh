package codingwithmosh;

public class LogicalOperators {
    
    public static void main(String[] args){
//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30; /*And operator will return true if both expressions return true*/
//        System.out.println(isWarm);
        Income();
    }
    public static void Income(){
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = (hasHighIncome || hasGoodCredit);
        System.out.println(isEligible);
    }
}
