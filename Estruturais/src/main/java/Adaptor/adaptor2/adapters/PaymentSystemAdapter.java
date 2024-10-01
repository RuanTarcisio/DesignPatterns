package Adaptor.adaptor2.adapters;

import Adaptor.adaptor2.inferfaces.ModernPaymentSystem;
import Adaptor.adaptor2.inferfaces.OldPaymentSystem;

public class PaymentSystemAdapter implements OldPaymentSystem {

    private ModernPaymentSystem modernPaymentSystem;

    public PaymentSystemAdapter(ModernPaymentSystem modernPaymentSystem) {
        this.modernPaymentSystem = modernPaymentSystem;
    }

    @Override
    public void makePayment(String paymentType, double amount) {
        if(paymentType.equalsIgnoreCase("credit")) {
            modernPaymentSystem.payWithCreditCard(amount);
        } else if(paymentType.equalsIgnoreCase("paypal")) {
            modernPaymentSystem.payWithPayPal(amount);
        } else if(paymentType.equalsIgnoreCase("bitcoin")) {
            modernPaymentSystem.payWithBitcoin(amount);
        } else {
            System.out.println("Invalid payment type. " + paymentType + " not supported");
        }
    }
}