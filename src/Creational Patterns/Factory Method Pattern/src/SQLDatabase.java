// This class implements the Database interface for SQL databases.

class SQLDatabase implements Database {
    public void connect() {  // Method to connect to SQL Database
        System.out.println("Connecting to SQL Database...");
    }

    public void saveUser(User user) {    // Method to save a user in SQL Database
        System.out.println("Saving user to SQL Database: " + user);
    }
}
