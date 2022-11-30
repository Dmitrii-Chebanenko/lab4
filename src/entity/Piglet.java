package entity;

import enums.Status;
import intefaces.CanBeUsedByActions;
import intefaces.CanExpand;
import intefaces.CanHear;
import thing.Story;
import thing.Thing;

public class Piglet extends Entity implements CanHear {

    private Eyes eyes = new Eyes("глаза Пяточка");
    public Piglet(String name){
        super(name);
    }
    public void hear(CanBeUsedByActions obj) {
        Story story = new Story ("историю");
        story.addStatus(Status.SAD);
        System.out.println(this.getName() + " слушает " + obj.superToString());
        eyes.expand();
    }

    public void hear(Entity sub, CanBeUsedByActions obj) {
        System.out.println(this.getName() + " и " + sub.getName() + " слушают " + obj.superToString());
    }

    private class Eyes extends Thing implements CanExpand {
        public Eyes(String name) {
            super(name);
        }

        public void expand() {
            this.addStatus(Status.EXPANDED);
            System.out.println(getName() + " " + Status.getStatus(Status.EXPANDED));
        }
    }
}
