package adapter.adapter_practice;

public class PaymentAdapter implements PaymentService{

    private RielCurrencyPayment rielCurrencyPayment;

    public PaymentAdapter(RielCurrencyPayment rielCurrencyPayment) {
        this.rielCurrencyPayment = rielCurrencyPayment;
    }


    @Override
    public boolean payAsDollar(double dollar) {
        if (rielCurrencyPayment == null) {
            throw new RuntimeException("rielCurrencyPayment object is null");
        }

        double riel = dollar * 4000;
        rielCurrencyPayment.payAsRiel(riel);
        System.out.println("Paid from Dollar: " + dollar + " $ -> Riel " + riel + "Riel");
        return true;
    }

}
