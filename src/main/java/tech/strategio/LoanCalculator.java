package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * Takes amount in as input and and iterates 3 times for amount of months
     * through each iteration amount is decreased by 10%.
     * Return amount when done.
     * @param /Method takes amount in as input,
     * @return Returns int amount when finished.
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Add your code below
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
