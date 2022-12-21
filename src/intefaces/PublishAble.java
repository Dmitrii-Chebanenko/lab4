package intefaces;

import places.Place;

public interface PublishAble {
    String getName();

    void publish(Place place, IsActionUseAble obj);
}
