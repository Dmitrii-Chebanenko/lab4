package entity;

import intefaces.RushAble;
import places.Place;

import java.util.ArrayList;
import java.util.Objects;


public class They extends Entity implements RushAble {
    private ArrayList<Entity> people = new ArrayList<>();

    public They(String name,Entity ... people){
        super(name);
        for(Entity entity : people){
            this.people.add(entity);
        }
    }

    public void addPeople(Entity ... people){
        for(Entity entity : people){
            this.people.add(entity);
        }
    }

    public void rush(Place place) {
        setLocation(place);
        for (Entity sub : people)
            sub.setLocation(place);
        System.out.println(this.getName() + " помчались по " + this.getLocation().getName());//Вокруг рощи
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        They they = (They) o;
        return Objects.equals(people, they.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), people);
    }

    @Override
    public String toString(){
        switch(people.size()){
            case 0: return "TheyIsEmpty";
            case 1: return people.get(0).getName();
            case 2: return people.get(0).getName() + " и " +
                    people.get(1).getName();
            default:
                String temp = "";
                for(int i = 0; i < people.size() - 1; i++){
                    temp += people.get(i).getName() + ", ";
                }
                temp = temp.substring(0, temp.length() - 2);
                temp += " и " + people.get(people.size() - 1).getName();
                return temp;
        }
    }
}
