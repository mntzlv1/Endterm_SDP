// This class represents a user with a name, age, and address.

class User {
    private String name;
    private int age;
    private String address;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {  // get the name
        return name;
    }

    public int getAge() {   // get the age
        return age;
    }

    public String getAddress() {   // get the address
        return address;
    }

    @Override
    public String toString() {  // Override toString for user details display
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}