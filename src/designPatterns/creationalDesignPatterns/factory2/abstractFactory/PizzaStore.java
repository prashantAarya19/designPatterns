package designPatterns.creationalDesignPatterns.factory2.abstractFactory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
