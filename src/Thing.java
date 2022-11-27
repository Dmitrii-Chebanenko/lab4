import java.util.HashSet;
import java.util.Objects;

public abstract class Thing  implements IPartOfStory, ICanBeUsedByActions{
    private String name;

    private HashSet<Status> status = new HashSet<>();

    public Thing() {
        name = "нет имени";
    }

    public Thing(String name) {
        this.name = name;
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

    public void addStatus(Status status){
        this.status.add(status);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashSet<Status> getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name) && Objects.equals(status, thing.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }

    @Override
    public String toString() {
        return  getStatusToString() + " " + this.getName();
    }
}
