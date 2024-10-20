package PaymentProcessingSystem;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment method don`t selected.");
        } else {
            paymentStrategy.processPayment(amount);
        }
    }
}

