package OrderProcessingSystem;

public class DeliveredState implements State {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already delivered. Payment not possible.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after delivery.");
    }
}
