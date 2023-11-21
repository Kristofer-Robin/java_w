package W4;

public class DecreasingCounter {
    private int value; // object variable that remembers the value of the counter
    private int initialValue; // object variable to remember the initial value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart; // Store the initial value
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // Decrease the value by one, but not below zero
        if (this.value > 0) {
            this.value--;
        }
    }

    public void reset() {
        // Set the value to zero
        this.value = 0;
    }

    public void setInitial() {
        // Set the value back to the initial value
        this.value = this.initialValue;
    }

    public static void main(String[] args) {
        // You can test your class here
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();
        
        // Test for reset
        counter.reset();
        counter.printValue();

        // Test for setting back to initial value
        counter.setInitial();
        counter.printValue();
    }
}
