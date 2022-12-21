package intefaces;

import enums.DaysOfTheWeek;
import enums.QuestionWord;

public interface AskAble {
    String getName();
    void ask(QuestionWord q, DaysOfTheWeek when);
}
