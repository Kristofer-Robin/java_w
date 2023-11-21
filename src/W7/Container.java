package W7;

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Container(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = suitcases.stream().mapToInt(Suitcase::totalWeight).sum();
        if (totalWeight + suitcase.totalWeight() <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        int totalWeight = suitcases.stream().mapToInt(Suitcase::totalWeight).sum();
        return suitcases.size() + " suitcases" + " (" + totalWeight + " kg)";
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
