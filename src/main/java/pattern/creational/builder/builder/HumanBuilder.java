package pattern.creational.builder.builder;

import pattern.creational.builder.model.Human;

public class HumanBuilder {
    private String name;
    private int age;
    private int weight;
    private int height;

    public HumanBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HumanBuilder age(int age) {
        this.age = age;
        return this;
    }

    public HumanBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public HumanBuilder height(int height) {
        this.height = height;
        return this;
    }

    public Human build() {
        return new Human(name, age, weight, height);
    }
}
