public class House extends Thing{
    private Entity owner;
    public House(String name, Entity owner) {
        super(name);
        this.owner = owner;
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }

    public Entity getOwner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return getStatusToString() + " " + getName() + " " + owner.getName();
    }
}
