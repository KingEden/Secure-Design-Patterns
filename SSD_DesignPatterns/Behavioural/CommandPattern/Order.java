
class Order {
    private String orderId;
    private String dealName;
    private boolean deliveryStatus;
    private boolean prepare;
    private String deliveryAddress;

    public Order(String orderId, String dealName, boolean deliveryStatus, String deliveryAddress, boolean prepare) {
        this.orderId = orderId;
        this.dealName = dealName;
        this.deliveryStatus = deliveryStatus;
        this.deliveryAddress = deliveryAddress;
        this.prepare = prepare;
    }

    public void placeOrder() {
        System.out.println("Order is being placed.");
    }

    public String getOrderId() {
        return orderId;
    }
}
