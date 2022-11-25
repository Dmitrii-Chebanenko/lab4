import java.util.ArrayList;

public abstract class Thing  implements IPartOfStory, ICanBeUsedByActions{
    private String name;

    private ArrayList<Status> status = new ArrayList<Status>();

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

    public ArrayList<Status> getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return  getStatusToString() + " " + this.getName();
    }
}
