package intefaces;

import enums.Status;
import places.Place;

public interface FindAble {
    default void find(IsLoseAble obj, Place where) {
        if (obj.getStatus().contains(Status.MISSING)) {
            obj.removeStatus(Status.MISSING);
            obj.setLocation(where);
            System.out.println(this.getName() + " нашел " + obj.superToString());
        }
        else {
            System.out.println("You can't find " + obj.getName() + " because he is not missing");
        }
    }
    String getName();
}
