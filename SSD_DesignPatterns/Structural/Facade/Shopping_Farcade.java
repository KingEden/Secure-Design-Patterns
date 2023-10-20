public class Shopping_Farcade {
    private Product product;
    private User_Authenication userAuth;
    private Ordering_Process orderingProcess;
    private Payment_Gateway paymentGateway;

    public Shopping_Farcade() {
        this.product = new Product();
        this.userAuth = new User_Authenication();
        this.orderingProcess = new Ordering_Process();
        this.paymentGateway = new Payment_Gateway();
    }

    // Methods to simplify interactions with the subsystems

    public void viewProductInformation(String productName) {
        product.GetInformation(); // Assuming you have a default product loaded
    }

    public void registerUser(String username, String password) {
        userAuth.UserRegister(username, password);
    }

    public void manageUser() {
        userAuth.ManageUser();
    }

    public void createOrder() {
        orderingProcess.create_order();
    }

    public void viewOrder() {
        orderingProcess.create_view();
    }

    public void modifyOrder() {
        orderingProcess.modify_Order();
    }

    public void makePayment() {
        paymentGateway.payment();
    }

    public void processPayment() {
        paymentGateway.payment_process();
    }

    // Additional methods for various shopping operations can be added here
}

