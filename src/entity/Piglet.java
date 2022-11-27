package entity;

import entity.Entity;
import intefaces.ICanBeUsedByActions;
import intefaces.ICanHear;

public class Piglet extends Entity implements ICanHear {
    public Piglet(String name){
        super(name);
    }
    public void hear(ICanBeUsedByActions obj) {
            System.out.println(this.getName() + " слушает " + obj.toString());
        }
    public void hear(Entity sub,ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " и " + sub.getName() + " слушают " + obj.toString());
    }
}
