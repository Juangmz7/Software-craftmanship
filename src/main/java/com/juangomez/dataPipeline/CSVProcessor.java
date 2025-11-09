package com.juangomez.dataPipeline;

public class CSVProcessor extends DataProcessor{
    @Override
    public void load() {
        System.out.println("Loading data for CSV");
    }

    @Override
    public void transform() {
        System.out.println("Transforming data for CSV");
    }

    @Override
    public void save() {
        System.out.println("Saving data to CSV");
    }

    @Override
    public boolean validateData() {
        return false;
    }
}
