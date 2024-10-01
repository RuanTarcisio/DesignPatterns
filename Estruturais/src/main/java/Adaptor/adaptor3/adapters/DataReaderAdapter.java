package Adaptor.adaptor3.adapters;


import Adaptor.adaptor3.inferfaces.CSVReader;
import Adaptor.adaptor3.inferfaces.JSONReader;
import Adaptor.adaptor3.inferfaces.XMLReader;

import java.util.ArrayList;
import java.util.List;

public class DataReaderAdapter implements CSVReader {
    private JSONReader jsonReader;
    private XMLReader xmlReader;

    public DataReaderAdapter(JSONReader jsonReader, XMLReader xmlReader) {
        this.jsonReader = jsonReader;
        this.xmlReader = xmlReader;
    }

    @Override
    public List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();
        if (filePath.endsWith(".json")) {
            List<String> jsonData = jsonReader.readJSON(filePath);
            for (String row : jsonData) {
                data.add(new String[]{row});
            }
        } else if (filePath.endsWith(".xml")) {
            List<String> xmlData = xmlReader.readXML(filePath);
            for (String row : xmlData) {
                data.add(new String[]{row});
            }
        } else {
            System.out.println("Invalid file format. Only .json and .xml are supported");
        }
        return data;
    }
}