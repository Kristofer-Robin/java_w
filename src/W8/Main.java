package W8;

public class Main {
    public static void main(String[] args) {
        VehicleRegister register = new VehicleRegister();
        
        register.add(new RegistrationPlate("FI", "ABC-123"), "Arto");
        register.add(new RegistrationPlate("FI", "UXE-465"), "Jurgen");
        register.printRegistrationPlates();
        register.printOwners();
    }
}
