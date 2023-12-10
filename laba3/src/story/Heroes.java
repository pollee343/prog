package story;

import abstracT.Human;
import enumerate.Mood;
import enumerate.Sex;

import java.util.Objects;

public class Heroes extends Human{

    private Mood mood;
    public Heroes(String name, Sex sex) {
        super(name, sex);
    }

    public String getMood() {
        return mood.getTittle();
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex);
    }

    @Override
    public String toString() {
        return "Heroes{" + "mood=" + mood + ", name='" + name + '\'' + ", sex=" + sex + '}';
    }
}

