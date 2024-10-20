package PaymentProcessingSystem;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("5635-8465-5453-8721", "Kolbay Ulan"));
        cart.checkout(100.0);

        cart.setPaymentStrategy(new PayPalPayment("ulan.kulbai@gmail.com"));
        cart.checkout(200.0);

        cart.setPaymentStrategy(new CryptoPayment("zxthrfmhvhnv12x3fbgbnx21dfgfx1b3cg"));
        cart.checkout(300.0);
    }
}
