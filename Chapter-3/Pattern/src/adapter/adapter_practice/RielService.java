package adapter.adapter_practice;

public class RielService implements RielCurrencyPayment {

    private Account account;
    public RielService(Account account) {
        this.account = account;
    }

    @Override
    public boolean payAsRiel(double riel) {
        if(account == null) {
            throw new RuntimeException("account object is null");
        }

        double dollar = riel / 4000;
        double accountBalance = account.getBalance();
        double payAmount = accountBalance - dollar;
        account.setBalance(payAmount);
        return true;

    }
}
