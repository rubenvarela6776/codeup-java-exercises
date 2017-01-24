package clones;

import clones.Countable;

/**
 * Created by rubenvarela on 1/20/17.
 */
public class Sheep implements Countable, Cloneable{
    int count = 0;
    String name;

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        count = 0;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return getCount() + " " + getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}