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
