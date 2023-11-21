package W5;

public class Counter {
    private int value;
    private boolean check;

    // Constructor with starting value and check
    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    // Constructor with starting value only, check is off by default
    public Counter(int startingValue) {
        this(startingValue, false);
    }

    // Constructor with check only, starting value is 0
    public Counter(boolean check) {
        this(0, check);
    }

    // Default constructor with starting value of 0 and check off
    public Counter() {
        this(0, false);
    }

    // Method to return the current value
    public int value() {
        return this.value;
    }

    // Method to increase the value by one
    public void increase() {
        this.value++;
    }

    // Method to decrease the value by one, with check
    public void decrease() {
        if (this.check && this.value <= 0) {
            // Do nothing because check is on and value is 0
        } else {
            this.value--;
        }
    }

    // Method to increase the value by an amount
    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    // Method to decrease the value by an amount, with check
    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (this.check && this.value - decreaseAmount < 0) {
                // If check is on and decrease would go below 0, do nothing
            } else {
                this.value -= decreaseAmount;
            }
        }
    }
}
