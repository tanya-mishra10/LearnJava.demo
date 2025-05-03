package JavaBankingApplication;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount("12345678", "Karan Singh", 5000, 3.5);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to bank app:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply interest");
            System.out.println("4. View account detail");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter deposit amount");
                    sa.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter withdraw amount");
                    sa.withdraw(sc.nextDouble());
                    break;
                case 3:
                    sa.applyInterest();
                    break;
                case 4:
                    sa.showDetails();
                    break;
                case 5:
                    System.out.println("thank you for using bank app");
                    break;
                default:
                    System.out.println("invalid choice ");

            }
        }
         while (choice != 5);
         sc.close();
    }
}
