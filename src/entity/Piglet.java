package entity;

import enums.Status;
import intefaces.FindAble;
import intefaces.IsActionUseAble;
import intefaces.ExpandAble;
import intefaces.HearAble;
import helpFunction.Random;
import thing.Thing;

public class Piglet extends Entity implements HearAble, FindAble {

    private Eyes eyes = new Eyes("глаза Пяточка");

    public Piglet(String name) {
        super(name);
    }

    public void hear(IsActionUseAble obj) {
        if (Random.getRandom(2) == 1) {
            System.out.println(this.getName() + " услышал " + obj.superToString());
        } else {
            System.out.println(this.getName() + " не слушает " + obj.superToString() + ". Ему все равно");
        }
    }

    private class Eyes extends Thing implements ExpandAble {
        public Eyes(String name) {
            super(name);
        }

        public void expand() {
            this.addStatus(Status.EXPANDED);
            System.out.println(getName() + " " + Status.getStatus(Status.EXPANDED));
        }
    }
}

