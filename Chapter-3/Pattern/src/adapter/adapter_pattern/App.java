package adapter.adapter_pattern;

public class App {
    public static void main(String[] args) {

        int riel = 5000;
        PaymentProcessor paymentProcessor = new CreditPayment();
        paymentProcessor.pay(riel);

        PaypalPayment paypalPayment = new PaypalPayment();
        PaymentAdapter paymentAdapter = new PaymentAdapter(paypalPayment);
        paymentAdapter.pay(riel);
    }
}
