package intefaces;

import enums.DaysOfTheWeek;
import enums.QuestionWord;

public interface ICanAsk {
    String getName();
    void ask(QuestionWord q, DaysOfTheWeek when);
}
