package verb;

import intefaces.CanBeUsedByActions;

public class Tell extends Verb {

    public Tell(String name) {
        super(name);
    }

    public String doSth(CanBeUsedByActions obj) {
        return this.getName() + " " + obj.superToString();
    }

}


