package com.juangomez.dataPipeline;

public abstract class DataProcessor {

    // Hollywood principle
    public void process () {
        load();
        if (validateData()) {
            transform();
            save();
        }
        else {
            System.out.println("Data validation failed");
        }
    }

    // Hook
    public boolean validateData() {
        return true;
    }

    abstract public void load ();

    abstract public void transform ();

    abstract public void save ();

}
