package designPatterns.creationalDesignPatterns.factory2.abstractFactory;

public class ChigoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChigoStyleCheesePizza();
        } else
            return null;
    }
}
