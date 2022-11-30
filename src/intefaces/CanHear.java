package intefaces;

import entity.Entity;

public interface CanHear {
    String getName();

    void hear(CanBeUsedByActions obj);
    void hear(Entity sub, CanBeUsedByActions obj);
}
