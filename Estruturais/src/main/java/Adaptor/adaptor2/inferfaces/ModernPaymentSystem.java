package Adaptor.adaptor2.inferfaces;

public interface ModernPaymentSystem {
    void payWithCreditCard(double amount);
    void payWithPayPal(double amount);
    void payWithBitcoin(double amount);
}
