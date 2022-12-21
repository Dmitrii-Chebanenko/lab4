package intefaces;

import enums.Status;

import java.io.File;

public interface SongChangeable {
    String getName();
    void songChange(Status status, String name, File file);
    void songChange(String name, File file);
}
