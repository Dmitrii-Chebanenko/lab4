import java.util.ArrayList;
import java.util.Objects;

public abstract class Entity implements IPartOfStory, ICanBeUsedByActions {
    private String name;
    private Place location;

    private boolean isHeOwner = false;
    private ArrayList<Status> status = new ArrayList<Status>();
    private ArrayList<Thing> partOfEntities = new ArrayList<Thing>();

    public Entity(){
        name = "неизвестно";
        //location =хз где
    }

    public Entity(String name){
        this.name = name;
    }

    public Entity(String name, Place location){
        this.name = name;
        this.location = location;
    }

    public Entity(String name, boolean temp){
        this.name = name;
        this.isHeOwner = temp;
    }

    public Entity(String name, Place location,boolean temp){
        this.name = name;
        this.location = location;
        this.isHeOwner = temp;
    }

    public void addStatus(Status status){
        this.status.add(status);
    }
    public void addPartOfEntities(Thing thing){
        this.partOfEntities.add(thing);
    }

    public void setLocation(Place location){
        this.location = location;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOwner(boolean temp){
        this.isHeOwner = temp;
    }

    public Place getLocation(){
        return this.location;
    }

    public String getName(){
        return this.name;
    }

    public boolean getIsHeOwner(){
        return this.isHeOwner;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, location);
    }

        /*@Override
        public boolean equals(Object otherObg){

        }*/

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + this.name + ", location=" + this.location + "]";
    }
}

