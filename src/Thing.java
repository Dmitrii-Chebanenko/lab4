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
        String temp = this.getStatus().toString();
        temp = temp.substring(1, temp.length() - 1);
        return temp;
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
