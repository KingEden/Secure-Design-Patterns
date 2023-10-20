package Prototype;

public class BurgerPrototypeDemo {
    public static void main(String[] args) {
        // Create a prototype burger
        PrototypeCache burgerPrototype = new PrototypeCache();
        burgerPrototype.setName("Generic Burger");
        burgerPrototype.setDesc("A basic burger");

        // Clone the prototype to create a specific burger
        PrototypeCache vegBurger = burgerPrototype.clone();
        vegBurger.setName("Veg Burger");
        vegBurger.setDesc("A burger with a vegetable patty in a bun");

        // Clone the prototype to create another specific burger
        PrototypeCache chickenBurger = burgerPrototype.clone();
        chickenBurger.setName("Chicken Burger");
        chickenBurger.setDesc("A burger with a chicken patty in a bun");

        // Display the details of the burgers
        System.out.println("Burger Name:" + vegBurger.getName() + "\nDescription: " + vegBurger.getDesc()+ "\n");
        System.out.println("Burger Name:" + chickenBurger.getName() + "\nDescription:" + chickenBurger.getDesc()+ "\n");
    
    }
}
