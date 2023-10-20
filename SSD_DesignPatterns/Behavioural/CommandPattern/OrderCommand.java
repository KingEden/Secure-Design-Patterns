
class OrderCommand implements Command {
    private Order order;
    private Restaurant restaurant;
    private DeliveryDriver driver;

    public OrderCommand(Order order, Restaurant restaurant, DeliveryDriver driver) {
        this.order = order;
        this.restaurant = restaurant;
        this.driver = driver;
    }

    @Override
    public void execute() {
        restaurant.placeOrder(order);
        restaurant.assignOrderToDriver(order, driver);
    }

    @Override
    public void undo() {
        System.out.println("Undoing the order...");
    }

    @Override
    public void redo() {
        System.out.println("Redoing the order...");
    }
}

