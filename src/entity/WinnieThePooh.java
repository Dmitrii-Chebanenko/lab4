package entity;

import entity.Entity;
import enums.DaysOfTheWeek;
import enums.Prepositions;
import enums.QuestionWord;
import intefaces.ICanAsk;
import intefaces.ICanBeUsedByActions;
import intefaces.ICanHear;
import intefaces.ICanPublish;
import places.Place;

public class WinnieThePooh extends Entity implements ICanPublish, ICanAsk, ICanHear {

    public WinnieThePooh(String name) {
        super(name);
    }

    public WinnieThePooh(String name, Place location) {
        super(name, location);
    }

    public void publish(Place place, ICanBeUsedByActions obj) {
        System.out.println(Prepositions.всю + " " + place.getName() + " " + this.getName() + " издал " + obj.toString());
    }

    public void ask(QuestionWord q, DaysOfTheWeek when) {
        System.out.println(this.getName() + " спросил: \"" + QuestionWord.getQuestionWord(q) + " по " + DaysOfTheWeek.whatDay(when) + "?\"");
    }

    public void hear(ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " слушает " + obj.toString());
    }

    public void hear(Entity sub, ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " и " + sub.getName() + " слушают " + obj.toString());
    }

}
