package pattern.structural.composite;

import pattern.structural.composite.composition.CompoundRoom;
import pattern.structural.composite.model.Bedroom;
import pattern.structural.composite.model.Kitchen;
import pattern.structural.composite.model.LivingRoom;
import pattern.structural.composite.model.Room;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Room bedroom = new Bedroom();
        Room kitchen = new Kitchen();
        Room livingRoom = new LivingRoom();
        Room oneMoreBedroom = new Bedroom();

        CompoundRoom rooms = new CompoundRoom();
        rooms.addAll(new ArrayList<>(Arrays.asList(bedroom, kitchen, livingRoom, oneMoreBedroom)));
        rooms.turnOnLight();

        rooms.remove(oneMoreBedroom);
        rooms.turnOffLight();
    }
}
