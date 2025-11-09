package com.juangomez.dataPipeline;

public class JSONProcessor extends DataProcessor{
    @Override
    public void load() {
        System.out.println("Loading data for JSON");
    }

    @Override
    public void transform() {
        System.out.println("Transforming data for JSON");
    }

    @Override
    public void save() {
        System.out.println("Saving data for JSON");
    }
}
