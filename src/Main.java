import entity.*;
import enums.DaysOfTheWeek;
import enums.QuestionWord;
import enums.Status;
import places.Marge;
import places.Road;
import places.House;
import thing.Story;
import thing.Thing;
import thing.Whoop;
import verb.Tell;

//Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
// Не успел Винни-Пух спросить: "Почему по четвергам?"-- как Кристофер Робин начал рассказывать грустную историю пропавшего дома Иа.
// Пух и Пятачок слушали, и глаза у них становились все больше и больше.
public class Main {
    public static void main(String[] args) {
        // //Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
        Marge marge = new Marge ("роща вокруг опушки");
        WinnieThePooh winnieThePooh = new WinnieThePooh ("Пух");
        ChristopherRobin christopherRobin = new ChristopherRobin ("Кристофер Робин");
        Piglet piglet = new Piglet ("Пяточек");
        They they = new They ("Они", winnieThePooh, piglet, christopherRobin);
        Whoop whoop = new Whoop ("возгласы");
        Road road = new Road ("дорога");
        they.rush(marge);
        whoop.addStatus(Status.WELCOMING);
        winnieThePooh.publish(road, whoop);

        //Не успел Винни-Пух спросить: "Почему по четвергам?"-- как Кристофер Робин начал рассказывать грустную историю пропавшего дома Иа.
        winnieThePooh.setName("Винни-Пух");
        winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.THURSDAY);
        Tell tell = new Tell("рассказывать");
        Story story = new Story ("историю");
        story.addStatus(Status.SAD);
        tell.addAddition(story);
        IA iA = new IA("Иа", true);
        House house = new House("дома", iA);
        house.addStatus(Status.MISSING);
        story.setStoryThing(house);
        christopherRobin.StartDoSomeThing(tell , story);
        // Пух и Пятачок слушали, и глаза у них становились все больше и больше.
        winnieThePooh.setName("Пух");
        winnieThePooh.hear(story);
        piglet.hear(story);
    }
}