package Adaptor.adaptor2.modelsImpl;

import Adaptor.adaptor2.inferfaces.OldPaymentSystem;

public class OldPaymentSystemImpl implements OldPaymentSystem {
    @Override
    public void makePayment(String paymentType, double amount) {
        // Implementação para processar pagamentos
        System.out.println("Processing " + paymentType + " payment of $" + amount);
    }
}