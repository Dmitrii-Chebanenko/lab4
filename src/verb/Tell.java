package verb;

import intefaces.ICanBeUsedByActions;

public class Tell extends Verb {

    public Tell(String name){
        super(name);
    }

    public String doSth(ICanBeUsedByActions obj) {
        return this.getName() + " " + obj.toString();
    }

}