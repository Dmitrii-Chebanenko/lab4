import java.util.ArrayList;
import java.util.Objects;

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

    public void ask(Question q, DaysOfTheWeek when) {
        System.out.println(this.getName() + " спросил: \"" + q.getName() + " по " + DaysOfTheWeek.whatDay(when) + "?\"");
    }

    public void hear(ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " слушает " + obj.toString());
    }

    public void hear(Entity sub,ICanBeUsedByActions obj) {
        System.out.println(this.getName() + " и " + sub.getName() + " слушают " + obj.toString());
    }

}
