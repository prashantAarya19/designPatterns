package designPatterns.creationalDesignPatterns.factory2.abstractFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        System.out.println("Ether ordered a " + nyCheesePizza.getName() + "\n");
        Pizza nyVeggiePizza = nyStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + nyVeggiePizza.getName() + "\n");

        PizzaStore  chicagoStore = new ChigoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("John ordered a " + chicagoPizza.getName() + "\n");
    }
}
