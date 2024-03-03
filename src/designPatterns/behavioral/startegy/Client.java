package designPatterns.behavioral.startegy;

public class Client {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.performQuack();
    }
}
