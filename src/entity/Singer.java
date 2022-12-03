package entity;

import intefaces.Singable;
import sounds.Sound;
import thing.Song;

public class Singer extends Entity implements Singable {
    public Singer(String name) {
        super(name);
    }
    public void sing(Song song){
        System.out.println(getName() + " начал свое выступление!11!!11!!");
        System.out.println(song.getWords());
        Sound.playSound(song.getPath()).join();
        System.out.println(getName() + " замолчал");
    }
}
