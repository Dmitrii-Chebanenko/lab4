package entity;

import intefaces.CanBeUsedByActions;
import intefaces.StartTell;
import places.Place;

public class ChristopherRobin extends Entity implements StartTell {
    public ChristopherRobin(String name) {
        super(name);
    }

    public ChristopherRobin(String name, Place location) {
        super(name, location);
    }

    public void StartTell(CanBeUsedByActions thing) {
        System.out.println(this.getName() + " начал рассказывать " + thing.superToString());
    }
}
