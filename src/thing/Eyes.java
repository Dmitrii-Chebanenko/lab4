package thing;

import enums.Status;
import intefaces.ICanExpand;

public class Eyes extends Thing implements ICanExpand {
    public Eyes(String name) {
        super(name);
    }
    public void expand(){
        this.addStatus(Status.EXPANDED);
        System.out.println(getName() + " " + Status.getStatus(Status.EXPANDED));
    }

}
