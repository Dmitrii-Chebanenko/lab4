package entity;

import enums.Status;
import intefaces.ICanBeUsedByActions;
import intefaces.ICanExpand;
import intefaces.ICanStartDoSomething;
import places.Place;
import thing.Thing;
import verb.Verb;

public class ChristopherRobin extends Entity implements ICanStartDoSomething {
    public ChristopherRobin(String name) {
        super(name);
    }

    public ChristopherRobin(String name, Place location) {
        super(name, location);
    }

    public void StartDoSomeThing(Verb obj, ICanBeUsedByActions thing) {
        System.out.println(this.getName() + " начал " + obj.doSth(thing));
    }
}
