
package W91;

import java.util.ArrayList;

public class Box implements Thing {
    private ArrayList<Thing> things;
    private int maximumCapacity;

    public Box(int maximumCapacity) {
        this.things = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() > this.maximumCapacity) {
            return false;
        } else {
            things.add(thing);
            return true;
        }
    }

    @Override
    public int getVolume() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getVolume();
        }
        return total;
    }

    @Override
    public String toString() {
        return "things in the box: " + this.getVolume() + " dm^3";
    }
}
