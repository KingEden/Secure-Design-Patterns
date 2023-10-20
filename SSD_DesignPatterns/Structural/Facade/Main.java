public class Main {
    public static void main(String[] args) {
        Shopping_Farcade shoppingFacade = new Shopping_Farcade();

        shoppingFacade.viewProductInformation("Cat Food");
        shoppingFacade.registerUser("Uzair Asif", "Meoqfak813");
        shoppingFacade.createOrder();
        shoppingFacade.modifyOrder();
        shoppingFacade.makePayment();
        shoppingFacade.processPayment();
    }
}
