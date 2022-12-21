import Exceptions.Checked.IncorrectSongException;
import entity.*;
import enums.DaysOfTheWeek;
import enums.QuestionWord;
import enums.Status;
import helpFunction.Random;
import places.Marge;
import places.Road;
import places.House;
import thing.*;

import java.io.File;


//Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
// Не успел Винни-Пух спросить: "Почему по четвергам?"-- как Кристофер Робин начал рассказывать грустную историю пропавшего дома Иа.
// Пух и Пятачок слушали, и глаза у них становились все больше и больше.
public class Main {
    public static void main(String[] args) throws InterruptedException, IncorrectSongException {
        //Слова песни неожиданно изменились
        File file1 = new File("./src/sounds/Rick_Astley_-_Never_Gonna_Give_You_Up_musmore.wav");
        if (!file1.exists()) {
            throw new IncorrectSongException("Файл не найден");
        }
        Song song = new Song("Never gonna give you up", file1);
        Singer singer1 = new Singer("МОРГЕНХУЙ");
        singer1.sing(song);
        song.songChange("КАДИЛАК", new File("./src/sounds/morgenshtern-eldzhej-kadillak-mp3.wav"));
        Thread.sleep(1000);
        singer1.sing(song);
        //Они помчались по опушке вокруг рощи, и всю дорогу Пух издавал приветственные возгласы.
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
        switch (Random.getRandom(6)) {
            case 0:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.MONDAY);
                break;
            case 1:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.TUESDAY);
                break;
            case 2:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.WEDNESDAY);
                break;
            case 3:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.THURSDAY);
                break;
            case 4:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.FRIDAY);
                break;
            case 5:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.SATURDAY);
                break;
            case 6:
                winnieThePooh.ask(QuestionWord.WHY, DaysOfTheWeek.SUNDAY);
                break;
        }
        Story story = new Story ("историю");
        story.addStatus(Status.SAD);
        IA iA = new IA("Иа", true);
        House house = new House("дома", iA);
        house.getLost();
        story.setStoryThing(house);
        // Пух и Пятачок слушали, и глаза у них становились все больше и больше.
        if (Random.getRandom(2) == 0) {
            christopherRobin.StartTell(story, piglet);
        }
        else{
            christopherRobin.StartTell(story, winnieThePooh);
        }
        house.setName("дом");
        switch (Random.getRandom(3)) {
            case 0:
                christopherRobin.find(house, marge);
                break;
            case 1:
                winnieThePooh.find(house, marge);
                break;
            case 2:
                piglet.find(house, marge);
                break;
            case 3:
                System.out.println("Все искали дом, но никто не нашел");
                break;
        }
        if (Random.getRandom(1) == 0){
            house.seem(Status.COMFORTABLE);
        }
        else{
            house.seem(Status.UNCOMFORTABLE);
        }
    }
}