package verb;

import intefaces.ICanBeUsedByActions;
import thing.Thing;

import java.util.HashSet;
import java.util.Objects;

public abstract class Verb implements ICanBeUsedByActions {
    private String name;
    private HashSet<Thing> addition= new HashSet<>();

    public abstract String doSth(ICanBeUsedByActions obj);

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

    public String superToString(){
        String result = addition.toString();
        result = result.substring(1, result.length() - 1);
        return name + " " + result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verb verb = (Verb) o;
        return Objects.equals(name, verb.name) && Objects.equals(addition, verb.addition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, addition);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "name='" + name + '\'' +
                ", addition=" + addition +
                '}';
    }
}
