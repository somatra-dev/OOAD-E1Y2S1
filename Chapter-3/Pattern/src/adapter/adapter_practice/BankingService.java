package adapter.adapter_practice;

public class BankingService implements PaymentService{

    private Account account;
    public BankingService(Account account) {
        this.account = account;
    }

    @Override
    public boolean payAsDollar(double dollar) {
        if(account == null){
            throw new RuntimeException("Account object is null");
        }
        double totalAmount = account.getBalance();
        double payAmount = totalAmount - dollar;
        account.setBalance(payAmount);
        System.out.println("Pay as Dollar: " + dollar + " $");
        return true;
    }
}
