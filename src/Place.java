public abstract class Place implements IPartOfStory, ICanBeUsedByActions{
    private String name;

    public Place() {
        name = "-";
    }

    public Place(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
