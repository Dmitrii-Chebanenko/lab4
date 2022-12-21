package places;

import entity.Entity;
import enums.Status;
import intefaces.IsLoseAble;
import intefaces.SeemAble;

public class House extends Place implements IsLoseAble, SeemAble {
    private Entity owner;
    private Place location;
    public House(String name, Entity owner) {
        super(name);
        this.owner = owner;
    }

    public House(String name, Entity owner, Place location) {
        super(name);
        this.owner = owner;
        this.location = location;
    }

    public void getLost() {
        System.out.println(this.getName() + " потерялся");
        location = new Somewhere();
        addStatus(Status.MISSING);
    }

    public void seem(Status status){
        System.out.println(this.getName() + " казался " + Status.getStatus(status));
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }
    public Entity getOwner() {
        return this.owner;
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public Place getLocation() {
        return this.location;
    }
    @Override
    public String superToString() {
        return getStatusToString() + " " + getName() + " " + owner.getName();
    }
}
