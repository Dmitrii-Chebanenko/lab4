package entity;

import entity.Entity;
import enums.Status;
import intefaces.ICanBeUsedByActions;
import intefaces.ICanExpand;
import intefaces.ICanHear;
import thing.Story;
import thing.Thing;

import java.util.ArrayList;

public class Piglet extends Entity implements ICanHear {

    private Eyes eyes = new Eyes("глаза Пяточка");
    public Piglet(String name){
        super(name);
    }
    public void hear(ICanBeUsedByActions obj) {
        Story story = new Story ("историю");
        story.addStatus(Status.SAD);
        System.out.println(this.getName() + " слушает " + obj.superToString());
        eyes.expand();
    }
    public void hear(Entity sub,ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " и " + sub.getName() + " слушают " + obj.superToString());
    }

    private class Eyes extends Thing implements ICanExpand {
        public Eyes(String name) {
            super(name);
        }

        public void expand() {
            this.addStatus(Status.EXPANDED);
            System.out.println(getName() + " " + Status.getStatus(Status.EXPANDED));
        }
    }
}
