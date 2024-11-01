// This class implements the Database interface for MongoDB databases.

class MongoDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to Mongo Database...");
    }

    public void saveUser(User user) {
        System.out.println("Saving user to Mongo Database: " + user);
    }
}
