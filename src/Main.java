import entity.*;
import enums.DaysOfTheWeek;
import enums.QuestionWord;
import enums.Songs;
import enums.Status;
import places.Marge;
import places.Road;
import places.House;
import thing.*;


//Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
// Не успел Винни-Пух спросить: "Почему по четвергам?"-- как Кристофер Робин начал рассказывать грустную историю пропавшего дома Иа.
// Пух и Пятачок слушали, и глаза у них становились все больше и больше.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Слова песьни неожиданно изменились
        Song song = new Song(Songs.NEVERGONNAGIVEMEUP);
        Singer singer1 = new Singer("МОРГЕНХУЙ");
        singer1.sing(song);
        song.songChange(Songs.КАДИЛАК);
        Thread.sleep(1000);
        singer1.sing(song);
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
        Story story = new Story ("историю");
        story.addStatus(Status.SAD);
        IA iA = new IA("Иа", true);
        House house = new House("дома", iA);
        house.addStatus(Status.MISSING);
        story.setStoryThing(house);
        christopherRobin.StartTell(story);
        // Пух и Пятачок слушали, и глаза у них становились все больше и больше.
        winnieThePooh.setName("Пух");
        winnieThePooh.hear(story);
        piglet.hear(story);
    }
}