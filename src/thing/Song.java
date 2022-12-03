package thing;

import enums.Songs;
import enums.Status;
import intefaces.SongChangeable;

import java.util.Random;

public class Song extends Thing implements SongChangeable {
    private String words;
    private String Path;

    public Song(){
        super ();
        Random random = new Random();
        int i = random.nextInt(3);
        switch (i) {
            case 0: super.setName(Songs.getName(Songs.ПОСОСИ));
                    Path = Songs.getPath(Songs.ПОСОСИ);
                    words = Songs.getWords(Songs.ПОСОСИ);
                    break;

            case 1: super.setName(Songs.getName(Songs.КАДИЛАК));
                    Path = Songs.getPath(Songs.КАДИЛАК);
                    words = Songs.getWords(Songs.КАДИЛАК);
                    break;
            case 2: super.setName(Songs.getName(Songs.NEVERGONNAGIVEMEUP));
                Path = Songs.getPath(Songs.NEVERGONNAGIVEMEUP);
                words = Songs.getWords(Songs.NEVERGONNAGIVEMEUP);
                break;
        }
    }

    public Song(Songs song){
        super.setName(Songs.getName(song));
        Path = Songs.getPath(song);
        words = Songs.getWords(song);
    }



    public void songChange(Status status, Songs song) {
        System.out.println("ПЕСЬНЯ " + Status.getStatus(status) + " ИЗМЕНИЛАСЬ");
        super.setName(Songs.getName(song));
        Path = Songs.getPath(song);
        words = Songs.getWords(song);
    }

    public void songChange(Songs song) {
        System.out.println("ПЕСЬНЯ ИЗМЕНИЛАСЬ");
        super.setName(Songs.getName(song));
        Path = Songs.getPath(song);
        words = Songs.getWords(song);
    }

    public String getWords() {
        return words;
    }

    public void setPath(String path) {
        Path = path;
    }

    public String getPath() {
        return Path;
    }
}
