package intefaces;

import entity.Entity;
import intefaces.ICanBeUsedByActions;

public interface ICanHear {
    String getName();

    void hear(ICanBeUsedByActions obj);
    void hear(Entity sub, ICanBeUsedByActions obj);
}
