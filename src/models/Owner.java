package models;

public class Owner extends Model {

    private String name;

    private String address;

    private String phoneNumber;

    public Owner(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.filePath = "/home/pity/development/java/veterinary/src/models/owners.csv";
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.address + "," + this.phoneNumber;
    }

}
