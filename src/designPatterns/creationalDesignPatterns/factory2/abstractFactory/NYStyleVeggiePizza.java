package designPatterns.creationalDesignPatterns.factory2.abstractFactory;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza(){
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese, Mashroom");
    }
}
