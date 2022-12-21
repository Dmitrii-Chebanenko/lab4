package entity;

import intefaces.FindAble;
import intefaces.IsActionUseAble;
import intefaces.HearAble;
import intefaces.StartTell;
import places.Place;

public class ChristopherRobin extends Entity implements StartTell, FindAble {
    public ChristopherRobin(String name) {
        super(name);
    }

    public ChristopherRobin(String name, Place location) {
        super(name, location);
    }

    public void StartTell(IsActionUseAble thing, HearAble entity) {
        System.out.println(this.getName() + " начал рассказывать " + thing.superToString());
        entity.hear(thing);
    }
}
