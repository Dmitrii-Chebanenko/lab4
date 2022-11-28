package intefaces;

import enums.DaysOfTheWeek;
import enums.QuestionWord;

public interface CanAsk {
    String getName();
    void ask(QuestionWord q, DaysOfTheWeek when);
}
