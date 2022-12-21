package intefaces;

import enums.Status;
import places.Place;

import java.util.HashSet;

public interface IsLoseAble {
     void getLost();
     void setLocation(Place location);

     Place getLocation();

     void addStatus(Status status);

     void removeStatus(Status status);


     public HashSet<Status> getStatus();

     String superToString();

     String getName();
}
