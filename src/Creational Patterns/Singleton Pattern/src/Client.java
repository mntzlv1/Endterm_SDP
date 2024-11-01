// This class represents a client who can purchase laptops.

class Client {
    private String name;

    public Client(String name) {  // Constructor to initialize client name
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void purchaseLaptop(Laptop laptop) {  // Method to process laptop purchase
        System.out.println("Processing payment for " + name + "...");
        System.out.println("Payment complete.");
    }
}


