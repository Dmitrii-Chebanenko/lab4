package intefaces;

import intefaces.ICanBeUsedByActions;
import places.Place;

public interface ICanPublish {
    String getName();

    void publish(Place place, ICanBeUsedByActions obj);
}
