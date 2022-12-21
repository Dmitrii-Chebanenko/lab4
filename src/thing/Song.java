package thing;

import enums.Status;
import intefaces.SongChangeable;

import java.io.File;

public class Song extends Thing implements SongChangeable {
    private File file;

    public Song(String name, File file) {
        super(name);
        this.file = file;
    }

    public void songChange(Status status, String name, File file){
        setName(name);
        this.file = file;
        System.out.println("Слова песни " + status + " изменились");
    }

    public void songChange(String name, File file){
        setName(name);
        this.file = file;
        System.out.println("Слова песни изменились");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
