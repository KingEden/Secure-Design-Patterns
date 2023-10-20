
class User {
    private Restaurant restaurant;
    private Order currentOrder;

    public User(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void placeOrder(String orderId, String dealName, boolean deliveryStatus, String deliveryAddress) {
        currentOrder = new Order(orderId, dealName, deliveryStatus, deliveryAddress, false);
        System.out.println("Order placed.");
    }

    public void confirmOrder() {
        if (currentOrder != null) {
            Command orderCommand = new OrderCommand(currentOrder, restaurant, null);
            restaurant.executeCommand(orderCommand);
        } else {
            System.out.println("No order to confirm.");
        }
    }

    public void assignDriver(DeliveryDriver driver) {
        if (currentOrder != null) {
            restaurant.assignOrderToDriver(currentOrder, driver);
        } else {
            System.out.println("No order to assign a driver.");
        }
    }

    public void undoOrder() {
        restaurant.undoCommand();
    }

    public void redoOrder() {
        restaurant.redoCommand();
    }
}