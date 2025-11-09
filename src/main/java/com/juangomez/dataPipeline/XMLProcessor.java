package com.juangomez.dataPipeline;

public class XMLProcessor extends DataProcessor{
    @Override
    public void load() {
        System.out.println("Loading data for XML");
    }

    @Override
    public void transform() {
        System.out.println("Transforming data for XML");
    }

    @Override
    public void save() {
        System.out.println("Saving data for XML");
    }
}
