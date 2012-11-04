package it.blackcat.demo.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Roberto Girelli
 * Date: 04/11/12
 * Time: 18.11
 */
public class ConcreteDecorator implements Decorator {
    IComponent component;
    public ConcreteDecorator(IComponent component) {
        super();
        this.component = component;
    }
    public void addedBehavior() {
        System.out.println("Decorator does some stuff too");
    }
    public void doStuff() {
        component.doStuff();
        addedBehavior();
    }
}
