package abstracT;

import enumerate.Mood;
import enumerate.Places;
import enumerate.Sex;
import interfaces.Action;
import interfaces.Move;

import java.util.Objects;


public abstract class Human implements Action, Move{
    protected String name;
    protected Sex sex;
    protected Mood mood;

    public Human(String name, Sex sex){
        this.name = name;
        this.sex = sex;
    }

    public String getName(){
        return name;
    }

    public Sex getSex(){
        return sex;
    }

    public String getMood(){
        return mood.getTittle();
    }

    public String getPlaces(Places place){
        return place.getTittle();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.getName()) && sex == human.getSex() && mood == human.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, mood);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", mood=" + mood +
                '}';
    }
}

