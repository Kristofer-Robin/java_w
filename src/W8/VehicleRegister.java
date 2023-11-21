package W8;

import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.containsKey(plate)) {
            return false;
        } else {
            this.owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        return this.owners.getOrDefault(plate, null);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : this.owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        HashSet<String> uniqueOwners = new HashSet<>(this.owners.values());
        for (String owner : uniqueOwners) {
            System.out.println(owner);
        }
    }
}
