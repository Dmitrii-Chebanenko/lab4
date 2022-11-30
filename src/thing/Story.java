package thing;

import intefaces.IPartOfStory;

import java.util.Objects;

public class Story extends Thing {

    private IPartOfStory StoryAbout;
    public Story() {
        super();
    }

    public Story(String name){
        super(name);
    }

    public void setStoryThing(IPartOfStory thing) {
        this.StoryAbout = thing;
    }

    @Override
    public void equate(Thing thing) {
        if (thing.getClass() == this.getClass()){
            super.equate(thing);
            this.StoryAbout = StoryAbout;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Story story = (Story) o;
        return Objects.equals(StoryAbout, story.StoryAbout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), StoryAbout);
    }


    @Override
    public String toString() {
        String result = super.toString();
        result = result.substring(0, result.length() - 1);
        return result + " " + this.StoryAbout + "]";
    }


    @Override
    public String superToString() {
        return getStatusToString() + " " + this.getName()  + " " + StoryAbout.superToString() ;
    }
}
