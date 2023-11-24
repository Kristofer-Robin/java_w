package W10;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    // ... similarly for the second healthy addition

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        // ... similarly for the second healthy addition
        return totalPrice;
    }
}
