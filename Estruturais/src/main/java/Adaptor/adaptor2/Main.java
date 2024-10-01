package Adaptor.adaptor2;


import Adaptor.adaptor2.adapters.PaymentSystemAdapter;
import Adaptor.adaptor2.inferfaces.OldPaymentSystem;
import Adaptor.adaptor2.modelsImpl.ModernPaymentSystemImpl;

public class Main {
    public static void main(String[] args) {
        OldPaymentSystem oldPaymentSystem = new PaymentSystemAdapter(new ModernPaymentSystemImpl());
        oldPaymentSystem.makePayment("credit", 100.00);
        oldPaymentSystem.makePayment("paypal", 50.00);
        oldPaymentSystem.makePayment("bitcoin", 200.00);
        oldPaymentSystem.makePayment("cash", 300.00);
    }
}