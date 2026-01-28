package adapter.adapter_pattern;


// service or library
public class PaypalPayment {
    public void pay(double dollar) {
        System.out.println("Paid: " + dollar + " $");
    }
}
