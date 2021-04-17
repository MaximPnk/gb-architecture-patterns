package pattern.creational.builder;

import pattern.creational.builder.builder.HumanBuilder;
import pattern.creational.builder.model.Human;

public class App {

    public static void main(String[] args) {
        Human human = new HumanBuilder().name("Alex").age(50).weight(70).height(180).build();
        System.out.println(human);
    }
}
