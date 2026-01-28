package adapter.adapter_pattern;

// client-code
public class CreditPayment implements PaymentProcessor {

    @Override
    public void pay(int riel) {
        System.out.println("Paid: " + riel + " Riel");
    }
}
