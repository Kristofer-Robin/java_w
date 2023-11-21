
package W91;

import moving.domain.Box;
import moving.domain.Thing;
import java.util.List;
import java.util.ArrayList;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        Box box = new Box(this.boxesVolume);
        for (Thing thing : things) {
            if (!box.addThing(thing)) {
                boxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(thing);
            }
        }
        boxes.add(box); // add the last box
        return boxes;
    }
}
