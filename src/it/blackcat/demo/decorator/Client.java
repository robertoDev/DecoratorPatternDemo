package it.blackcat.demo.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: Roberto Girelli
 * Date: 04/11/12
 * Time: 18.12
 */
public class Client {
    public static void main(String[] args) {
        IComponent comp = new Component();
        Decorator decorator = new ConcreteDecorator(comp);
        decorator.doStuff();
    }
}