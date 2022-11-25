public class ChristopherRobin extends Entity implements ICanStatTell {
    public ChristopherRobin(String name) {
        super(name);
    }

    public ChristopherRobin(String name, Place location) {
        super(name, location);
    }

    public void StartTell(Tell obj, ICanBeUsedByActions thing) {
        System.out.println(this.getName() + " начал " + obj.tellSth(thing));
    }
}
