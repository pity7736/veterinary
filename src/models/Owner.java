package models;

import java.util.ArrayList;
import java.util.List;

import utils.IO;


public class Owner {

    private String id;

    private String name;

    private String address;

    private String phoneNumber;

    private static List<Owner> records = new ArrayList<Owner>();

    private static String filePath = "/home/pity/development/java/veterinary/src/models/owners.csv";

    private int maxRecords = 5;

    private static IO io = IO.instance();

    public Owner(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void add(){
        Owner.records.add(this);
        if (Owner.records.size() == this.maxRecords){
            this.recordsToFile();
            Owner.records.clear();
        }
    }

    private void recordsToFile(){
        for (Owner owner: Owner.records) {
            io.writeToFile(Owner.filePath, owner.toString());
        }
    }

    @Override
    public String toString() {
        return this.id + "," + this.name + "," + this.address + "," + this.phoneNumber;
    }

}
