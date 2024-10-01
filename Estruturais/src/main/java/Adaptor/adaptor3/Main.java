package Adaptor.adaptor3;


import Adaptor.adaptor3.adapters.DataReaderAdapter;
import Adaptor.adaptor3.inferfaces.CSVReader;
import Adaptor.adaptor3.modelsImpl.JSONReaderImpl;
import Adaptor.adaptor3.modelsImpl.XMLReaderImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVReader adapter = new DataReaderAdapter(new JSONReaderImpl(), new XMLReaderImpl());

        // Teste com arquivo JSON
        System.out.println("Reading JSON data:");
        List<String[]> jsonData = adapter.readCSV("data.json");
        for (String[] row : jsonData) {
            System.out.println(row[0]);
        }

        // Teste com arquivo XML
        System.out.println("Reading XML data:");
        List<String[]> xmlData = adapter.readCSV("data.xml");
        for (String[] row : xmlData) {
            System.out.println(row[0]);
        }

        // Teste com arquivo CSV
        System.out.println("Reading CSV data:");
        List<String[]> csvData = adapter.readCSV("data.csv");
        for (String[] row : csvData) {
            System.out.println(row[0]);
        }
    }
}