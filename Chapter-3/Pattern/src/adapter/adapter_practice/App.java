package adapter.adapter_practice;

import java.time.Instant;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        double amount = 100.00;
        Account account = new Account();
        account.setId("1");
        account.setBalance(amount);
        account.setAccNumber("0123456789");
        account.setCreateDate(Date.from(Instant.now()));
        PaymentService paymentService = new BankingService(account);
        paymentService.payAsDollar(10.0);

        RielCurrencyPayment rielCurrencyPayment = new RielService(account);
        rielCurrencyPayment.payAsRiel(40000.0);

        PaymentAdapter paymentAdapter = new PaymentAdapter(rielCurrencyPayment);
        paymentAdapter.payAsDollar(10.0);

        System.out.println(account.getBalance());

    }
}
