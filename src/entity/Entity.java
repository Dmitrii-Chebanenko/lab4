package entity;

import enums.Status;
import intefaces.CanBeUsedByActions;
import places.Place;
import thing.Thing;

import java.util.HashSet;
import java.util.Objects;

public abstract class Entity implements IPartOfStory, CanBeUsedByActions {
    private String name;
    private Place location;

    private boolean isHeOwner = false;
    private HashSet<Status> status = new HashSet<>();
    private HashSet<Thing> partOfEntities = new HashSet<>();

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

    public Entity(String name, Place location, boolean temp){
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return isHeOwner == entity.isHeOwner && Objects.equals(name, entity.name) && Objects.equals(location, entity.location) && Objects.equals(status, entity.status) && Objects.equals(partOfEntities, entity.partOfEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, isHeOwner, status, partOfEntities);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[name=" + this.name + ", location=" + this.location + "]";
    }
}

