package pattern.structural.composite.composition;

import pattern.structural.composite.model.Room;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CompoundRoom implements Room {

    List<Room> rooms;

    public CompoundRoom() {
        rooms = new ArrayList<>();
    }

    public void addAll(Collection<Room> rooms) {
        this.rooms.addAll(rooms);
    }

    public void add(Room room) {
        this.rooms.add(room);
    }

    public void removeAll(Collection<Room> rooms) {
        this.rooms.removeAll(rooms);
    }

    public void remove(Room room) {
        this.rooms.remove(room);
    }

    @Override
    public void turnOnLight() {
        rooms.forEach(Room::turnOnLight);
    }

    @Override
    public void turnOffLight() {
        rooms.forEach(Room::turnOffLight);
    }
}
