package Practise.decisionmaking.banking;

import java.util.Scanner;

public class AccountValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the account type: ");
        String accountType = sc.nextLine().toLowerCase(); // Convert input to lowercase
        
        if (accountType.equals("savings") || accountType.equals("current")) {
            System.out.println("Valid account type.");
        } else {
            System.out.println("Invalid account type.");
        }
        
        sc.close();
        
    }
}
