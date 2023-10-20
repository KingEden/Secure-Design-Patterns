public class CommandPattern {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        User user = new User(restaurant);


        user.placeOrder("Uzair Asif", "Yummmy Burger", true, "My Home");
        user.confirmOrder();
        DeliveryDriver driver = new DeliveryDriver();
        user.assignDriver(driver);
        driver.deliverOrder();
        user.undoOrder();
        user.redoOrder();
    }
}

