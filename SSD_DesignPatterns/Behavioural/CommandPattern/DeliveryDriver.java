
class DeliveryDriver {
    private Order order;

    public void assigningOrder(Order order) {
        this.order = order;
        System.out.println("Order has been assigned to the driver.");
    }

    public void deliverOrder() {
        if (order != null) {
            System.out.println("Order delivered to: " + order.getOrderId());
        } else {
            System.out.println("No order assigned to the driver.");
        }
    }
}
