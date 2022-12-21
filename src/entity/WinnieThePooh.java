package entity;

import Exceptions.Unchecked.IncorrectStatus;
import enums.DaysOfTheWeek;
import enums.Prepositions;
import enums.QuestionWord;
import enums.Status;
import helpFunction.Random;
import intefaces.*;
import places.Place;
import thing.Thing;

public class WinnieThePooh extends Entity implements PublishAble, AskAble, HearAble, FindAble {

    private Eyes eyes = new Eyes("глаза Винни-Пуха");

    public WinnieThePooh(String name) {
        super(name);
    }

    public WinnieThePooh(String name, Place location) {
        super(name, location);
    }


    public void publish(Place place, IsActionUseAble obj) {
        System.out.println(Prepositions.всю + " " + place.getName() + " " + this.getName() + " издал " + obj.superToString());
    }


    public void ask(QuestionWord q, DaysOfTheWeek when) {
        System.out.println(this.getName() + " спросил: \"" + QuestionWord.getQuestionWord(q) + " по " + DaysOfTheWeek.whatDay(when) + "?\"");
    }

    public void hear(IsActionUseAble obj) {
        if (Random.getRandom(2) == 1) {
            System.out.println(this.getName() + " услышал " + obj.superToString());
            switch (Random.getRandom(3)) {
                case 0:
                    eyes.expand();
                    break;
                case 1:
                    eyes.shrink();
                    break;
                case 2:
                    System.out.println(eyes.getName() + " остались неизменными");
                    break;
            }

        }
        else {
            System.out.println(this.getName() + " не слушает " + obj.superToString() + ". Ему все равно");
        }
    }


    private class Eyes extends Thing implements ExpandAble, ShrinkAble {
        public Eyes(String name) {
            super(name);
        }

        public void expand() {
            System.out.println(getName() + " " + Status.getStatus(Status.EXPANDED));


                if (this.getStatus().contains(Status.EXPANDED))
                    throw new IncorrectStatus("Глаза уже расширены");
                else {
                    if (this.getStatus().contains(Status.SHRINKED)) {
                        this.removeStatus(Status.SHRINKED);
                    } else {
                        this.addStatus(Status.EXPANDED);
                    }
                }

        }

        public void shrink() {
            System.out.println(getName() + " " + Status.getStatus(Status.SHRINKED));
            if (this.getStatus().contains(Status.EXPANDED))
                throw new IncorrectStatus("Глаза уже сужены");
            else {
                if (this.getStatus().contains(Status.EXPANDED)) {
                    this.removeStatus(Status.EXPANDED);
                } else {
                    this.addStatus(Status.SHRINKED);
                }
            }
        }
    }
}
