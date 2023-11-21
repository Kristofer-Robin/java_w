package W7;

public class Main {
    public static void main(String[] args) {
        // Example usage of Thing, Suitcase, and Container classes
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(suitcase);

        System.out.println(container);

        // Further examples can be added here to test the functionality
    }
}
