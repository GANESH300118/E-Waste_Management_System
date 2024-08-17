import java.util.ArrayList;
import java.util.Scanner;

class EWaste {
    private String itemName;
    private String category;
    private boolean isRecyclable;

    public EWaste(String itemName, String category, boolean isRecyclable) {
        this.itemName = itemName;
        this.category = category;
        this.isRecyclable = isRecyclable;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + " | Category: " + category + " | Recyclable: " + (isRecyclable ? "Yes" : "No");
    }
}

class EWasteMonitoringSystem {
    private ArrayList<EWaste> ewasteList;

    public EWasteMonitoringSystem() {
        ewasteList = new ArrayList<>();
    }

    public void addEWaste(EWaste ewaste) {
        ewasteList.add(ewaste);
    }

    public void displayEWaste() {
        if (ewasteList.isEmpty()) {
            System.out.println("No e-waste items found.");
        } else {
            System.out.println("E-Waste Items:");
            for (EWaste ew : ewasteList) {
                System.out.println(ew);
            }
        }
    }

    public void filterRecyclable() {
        System.out.println("Recyclable E-Waste Items:");
        for (EWaste ew : ewasteList) {
            if (ew.isRecyclable()) {
                System.out.println(ew);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EWasteMonitoringSystem system = new EWasteMonitoringSystem();

        system.addEWaste(new EWaste("Old Laptop", "Electronics", true));
        system.addEWaste(new EWaste("CRT Monitor", "Electronics", false));
        system.addEWaste(new EWaste("Smartphone", "Electronics", true));

        system.displayEWaste();
        system.filterRecyclable();

        System.out.println("Do you want to add more e-waste items? (yes/no)");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter category: ");
            String category = scanner.nextLine();
            System.out.print("Is it recyclable? (yes/no): ");
            boolean isRecyclable = scanner.nextLine().equalsIgnoreCase("yes");

            system.addEWaste(new EWaste(itemName, category, isRecyclable));

            System.out.println("Item added successfully!");
            System.out.println("Do you want to add more items? (yes/no)");
            response = scanner.nextLine();
        }

        system.displayEWaste();

        scanner.close();
    }
}