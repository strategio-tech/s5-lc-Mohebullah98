import java.util.Scanner;

public class Main
{
    public static int getRemainingAmountIn3Months(int amount){
        /**
         * Method takes amount in as input, and iterates 3 times for amount of months
         * through each iteration amount is decreased by 10%.
         * Returns int amount when finished.
         */
        int count=0;
        while(count<3){
            amount-=amount/10;
            count++;
        }
        return amount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}