package designPatterns.creationalDesignPatterns.factory2.abstractFactory;

public class ChigoStyleCheesePizza extends Pizza
{
    public ChigoStyleCheesePizza()
    {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
