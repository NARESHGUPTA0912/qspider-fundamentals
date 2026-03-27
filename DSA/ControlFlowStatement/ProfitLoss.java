package ControlFlowStatement;

import java.util.Scanner;

class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price: ");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price: ");
        double sp = sc.nextDouble();

        if (sp > cp)
            System.out.println("Profit % = " + ((sp - cp) / cp * 100));
        else if (cp > sp)
            System.out.println("Loss % = " + ((cp - sp) / cp * 100));
        else
            System.out.println("No Profit No Loss");
        sc.close();
    }
}
