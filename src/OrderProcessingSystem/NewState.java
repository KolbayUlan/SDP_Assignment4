package OrderProcessingSystem;

public class NewState implements State {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is paid. Moving to Paid state.");
        order.setState(new PaidState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped before payment.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered before payment and shipping.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled. Moving to Cancelled state.");
        order.setState(new CancelledState());
    }
}
