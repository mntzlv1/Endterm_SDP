// This class creates database instances based on the provided type.
class DatabaseFactory {
    public Database createDatabase(String type) {   // Method to create a database
        if ("SQL".equalsIgnoreCase(type)) {
            return new SQLDatabase();
        } else if ("Mongo".equalsIgnoreCase(type)) {
            return new MongoDatabase();
        }
        return null;  // Return null for invalid types
    }
}