package Adaptor.adaptor2.modelsImpl;


import Adaptor.adaptor2.inferfaces.ModernPaymentSystem;

public class ModernPaymentSystemImpl implements ModernPaymentSystem {

    @Override
    public void payWithCreditCard(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }

    @Override
    public void payWithPayPal(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }

    @Override
    public void payWithBitcoin(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}