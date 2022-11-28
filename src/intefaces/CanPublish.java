package intefaces;

import places.Place;

public interface CanPublish {
    String getName();

    void publish(Place place, CanBeUsedByActions obj);
}
