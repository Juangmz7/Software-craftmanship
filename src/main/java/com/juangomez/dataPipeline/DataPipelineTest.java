package com.juangomez.dataPipeline;



public class DataPipelineTest {
    public static void main(String[] args) {
        var jsonProcessor = new JSONProcessor();
        jsonProcessor.process();

        var csvProcessor = new CSVProcessor();
        csvProcessor.process();

        var xmlProcessor = new XMLProcessor();
        xmlProcessor.process();
    }
}
