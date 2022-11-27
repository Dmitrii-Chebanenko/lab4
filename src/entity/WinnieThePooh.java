package entity;

import entity.Entity;
import enums.DaysOfTheWeek;
import enums.Prepositions;
import enums.QuestionWord;
import enums.Status;
import intefaces.*;
import places.Place;
import thing.Story;
import thing.Thing;

public class WinnieThePooh extends Entity implements ICanPublish, ICanAsk, ICanHear {

    private Eyes eyes = new Eyes("глаза Винни-Пуха");

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
        Story story = new Story ("историю");
        story.addStatus(Status.SAD);
        System.out.println(this.getName() + " слушает " + obj.toString());
        eyes.expand();
    }

    public void hear(Entity sub, ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " и " + sub.getName() + " слушают " + obj.toString());
    }

    private class Eyes extends Thing implements ICanExpand {
        public Eyes(String name) {
            super(name);
        }

        public void expand() {
            this.addStatus(Status.EXPANDED);
            System.out.println(getName() + " " + Status.getStatus(Status.EXPANDED));
        }
    }

}
