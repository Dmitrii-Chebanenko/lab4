package places;

import enums.Status;
import intefaces.ICanBeUsedByActions;
import intefaces.IPartOfStory;

import java.util.HashSet;
import java.util.Objects;

public abstract class Place implements IPartOfStory, ICanBeUsedByActions {
    private String name;

    private HashSet<Status> status = new HashSet<>();

    public Place() {
        name = "-";
    }

    public Place(String name) {
        this.name = name;
    }

    public void addStatus(Status status){
        this.status.add(status);
    }

    public String getStatusToString(){
        String ans = "";
        for (Status s : this.status){
            ans += Status.getStatus(s);
            ans+=", ";
        }
        ans = ans.substring(0, ans.length()-2);
        return ans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(name, place.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getName();
    }
}
