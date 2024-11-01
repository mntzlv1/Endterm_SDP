// This class implements the Singleton pattern for managing laptop inventory.


import java.util.HashMap;

class LaptopInventory {
    private static LaptopInventory instance;   // Singleton instance
    private HashMap<String, Laptop> laptopModels;   // HashMap to store laptop models

    private LaptopInventory() {   // Private constructor to prevent external instantiation
        laptopModels = new HashMap<>();
        laptopModels.put("Dell", new Laptop("Dell Inspiron 15", 850));
        laptopModels.put("HP", new Laptop("HP Pavilion", 920));
        laptopModels.put("Lenovo", new Laptop("Lenovo ThinkPad", 1000));
    }

    public static LaptopInventory getInstance() {   // Method to get the Singleton instance
        if (instance == null) {    // Create instance if it doesn't exist
            instance = new LaptopInventory();
        }
        return instance;
    }

    public Laptop getLaptop(String model) {   // Method to retrieve a laptop by model name
        return laptopModels.get(model);   // Return the laptop if found
    }
}



