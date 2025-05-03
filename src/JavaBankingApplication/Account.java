package JavaBankingApplication;

public class Account {
    private String accountNo;
    private String accountHolderName;
    protected double balance;

    public Account(String accountNo, String accountHolderName, double balance){
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("deposite amount" + " " + amount);
        }
        else {
            System.out.println("invalid amount");
        }
    }
    public void  withdraw(double amount){
        if(amount<0 && amount<= balance){
            balance -= amount;
            System.out.println("withdraw amount " + amount);
        }
        else {
            System.out.println("insufficient amount ");
        }
    }

    public void showDetails(){
        System.out.println("Your account No is " + accountNo );
        System.out.println("AccountHolder name is " + accountHolderName);
        System.out.println("Total balence " + balance);
    }


}
