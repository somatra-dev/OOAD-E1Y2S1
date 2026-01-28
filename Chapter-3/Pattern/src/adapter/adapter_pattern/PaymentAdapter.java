package adapter.adapter_pattern;


// adapter for convert
public class PaymentAdapter implements PaymentProcessor {

    // association relationship
    private PaypalPayment paypalPayment;
    public PaymentAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    @Override
    public void pay(int riel) {
        double dollar = (double) riel / 4200;
        paypalPayment.pay(dollar);
    }

}

