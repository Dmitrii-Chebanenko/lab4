public class Eyes extends Thing implements ICanExpand{
    public Eyes(String name) {
        super(name);
    }
    public void expand(){
        this.addStatus(Status.расширялись);
        System.out.println(getName() + " " + Status.расширялись);
    }

}
