// This interface defines the methods for database operations.

interface Database {
    void connect();  // Method to connect to the database
    void saveUser(User user);  // Method to save a user in the database
}
