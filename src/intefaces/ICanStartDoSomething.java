package intefaces;

import intefaces.ICanBeUsedByActions;
import verb.Verb;

public interface ICanStartDoSomething {
    String getName();

    void StartDoSomeThing(Verb obj, ICanBeUsedByActions thing);
}
