package entity;

import intefaces.CanBeUsedByActions;
import intefaces.CanStartDoSomething;
import places.Place;
import verb.Verb;

public class ChristopherRobin extends Entity implements CanStartDoSomething {
    public ChristopherRobin(String name) {
        super(name);
    }

    public ChristopherRobin(String name, Place location) {
        super(name, location);
    }

    public void StartDoSomeThing(Verb obj, CanBeUsedByActions thing) {
        System.out.println(this.getName() + " начал " + obj.doSth(thing));
    }
}
