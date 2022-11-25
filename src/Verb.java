import java.util.ArrayList;
import java.util.Objects;

public abstract class Verb implements ICanBeUsedByActions {
    private String name;

    private ArrayList<Thing> addition= new ArrayList<Thing>();

    public Verb() {
        name = "нет действия";
    }

    public Verb(String name) {
        this.name = name;
    }

    public void addAddition(Thing addition) {
        this.addition.add(addition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
