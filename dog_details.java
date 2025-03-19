package Problem_solving;

public class dog_details {
    private String name;
    private String breed;
    private double price;
    private String location;
    private String ownerDetails;

    public dog_details(String name, String breed, double price, String location, String ownerDetails) {
        this.name = name;
        this.breed = breed;
        this.price = price;
        this.location = location;
        this.ownerDetails = ownerDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerDetails() {
        return ownerDetails;
    }

    public void setOwnerDetails(String ownerDetails) {
        this.ownerDetails = ownerDetails;
    }

    public void displayDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Price: " + price);
        System.out.println("Location: " + location);
        System.out.println("Owner Details: " + ownerDetails);
    }

    public static void main(String[] args) {
        dog_details dog = new dog_details("kevin", "Golden Retriever", 15000.0, "New York", "Doe kane, 1234567890");
        dog.displayDetails();
    }
}
