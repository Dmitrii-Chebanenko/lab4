
public class Tell extends Verb {

    public Tell(String name){
        super(name);
    }

    public String tellSth(ICanBeUsedByActions obj) {
        return this.getName() + " " + obj.toString();
    }

}
