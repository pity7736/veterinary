package models;


public class Pet extends Model {

    private String name;

    private int code;

    private String breed;

    private String gender;

    int age;

    public Pet(String id, String name, int code, String breed, String gender, int age) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.filePath = "/home/pity/development/java/veterinary/src/models/pets.csv";
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.code + "," + this.breed + "," + this.gender + "," + this.age;
    }
}
