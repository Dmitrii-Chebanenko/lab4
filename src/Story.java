import java.util.ArrayList;

public class Story extends Thing {
    public Story() {
        super();
    }

    public Story(String name){
        super(name);
    }

    private IPartOfStory StoryAbout;//кастыль история рассказываеться только от thing, решение создать интерфейс

    public void setStoryThing(IPartOfStory thing) {
        this.StoryAbout = thing;
    }


    @Override
    public String toString() {
        return getStatusToString() + " " + this.getName()  + " " + StoryAbout.toString();
    }
}
