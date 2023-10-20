
class Restaurant {
    private Command executedCommand;

    public void assignOrderToDriver(Order order, DeliveryDriver driver) {
        if (order != null && driver != null) {
            driver.assigningOrder(order);
            System.out.println("Order has been assigned to the delivery driver.");
        } else {
            System.out.println("........");
        }
    }

    public void placeOrder(Order order) {
        if (order != null) {
            order.placeOrder();
            System.out.println("Order has been placed.");
        } else {
            System.out.println("Invalid order.");
        }
    }

    public void executeCommand(Command command) {
        if (command != null) {
            command.execute();
            executedCommand = command;
        } else {
            System.out.println("Invalid command.");
        }
    }

    public void undoCommand() {
        if (executedCommand != null) {
            executedCommand.undo();
            executedCommand = null;
            System.out.println("Undoing Order");
        } else {
            System.out.println("Undoing Order....");
        }
    }

    public void redoCommand() {
        if (executedCommand != null) {
            executedCommand.redo();
            System.out.println("Redo command executed.");
        } else {
            System.out.println("Redoing Order......");
        }
    }
}
