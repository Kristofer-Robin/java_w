package W7;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maximumWeight;
    private int totalWeight;

    public Suitcase(int maximumWeight) {
        this.things = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        this.totalWeight = 0;
    }

    public void addThing(Thing thing) {
        if (this.totalWeight + thing.getWeight() <= this.maximumWeight) {
            things.add(thing);
            this.totalWeight += thing.getWeight();
        }
    }

    public String toString() {
        String description = things.size() + " thing" + (things.size() != 1 ? "s" : "");
        return description + " (" + this.totalWeight + " kg)";
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        
        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
}
