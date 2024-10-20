package OrderProcessingSystem;

public class ShippedState implements State {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid and shipped.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is delivered. Moving to Delivered state.");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cannot be cancelled after it is shipped.");
    }
}
