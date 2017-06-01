package models;

import java.util.ArrayList;
import java.util.List;

import utils.IO;

public class Pet {

    private String id;

    private String name;

    private int code;

    private String breed;

    private String gender;

    int age;

    private static List<Pet> records = new ArrayList<Pet>();

    private static String filePath = "/home/pity/development/java/veterinary/src/models/pets.csv";

    private int maxRecords = 5;

    private static IO io = IO.instance();

    public Pet(String id, String name, int code, String breed, String gender, int age) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
    }

    public void add(){
        Pet.records.add(this);
        if (Pet.records.size() == this.maxRecords){
            this.recordsToFile();
            Pet.records.clear();
        }
    }

    private void recordsToFile(){
        for (Pet owner: Pet.records) {
            io.writeToFile(Pet.filePath, owner.toString());
        }
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.code + "," + this.breed + "," + this.gender + "," + this.age;
    }
}
