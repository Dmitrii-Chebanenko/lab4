package intefaces;

import enums.Songs;
import enums.Status;

public interface SongChangeable {
    String getName();
    void songChange(Status status, Songs song);
    void songChange(Songs song);
}
