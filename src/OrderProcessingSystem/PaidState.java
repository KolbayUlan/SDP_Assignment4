package OrderProcessingSystem;

public class PaidState implements State {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is shipped. Moving to Shipped state.");
        order.setState(new ShippedState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered before shipping.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled. Moving to Cancelled state.");
        order.setState(new CancelledState());
    }
}
