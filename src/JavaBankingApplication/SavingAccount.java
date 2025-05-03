package JavaBankingApplication;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNo, String accountHolderName, double balance, double interestRate){
        super(accountNo, accountHolderName, balance);
        this.interestRate = interestRate;

    }

    public void applyInterest(){
      double interest = balance * (interestRate / 100);
      balance += interestRate;
        System.out.println("Interest of " + interest + "applied");
    }

}
