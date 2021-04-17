package pattern.creational.prototype;

import pattern.creational.prototype.model.Earphones;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        Earphones first = new Earphones(700, 2000);
        Earphones second = (Earphones) first.clone();
        System.out.println(first);
        System.out.println(second);

        System.out.println("Equals: " + first.equals(second));
        System.out.println("Same: " + (first == second));
    }
}
