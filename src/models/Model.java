package models;

import java.util.ArrayList;
import java.util.List;

import utils.IO;


public abstract class Model {

    protected String id;

    private int maxRecords = 1;

    private static IO io = IO.instance();

    private static List<Model> records = new ArrayList<Model>();

    protected String filePath;

    public void add(){
        records.add(this);
        if (records.size() == this.maxRecords){
            this.recordsToFile();
            records.clear();
        }
    }

    private void recordsToFile(){
        for (Model model: records) {
            io.writeToFile(this.filePath, model.toString());
        }
    }

    @Override
    public abstract String toString();

}
