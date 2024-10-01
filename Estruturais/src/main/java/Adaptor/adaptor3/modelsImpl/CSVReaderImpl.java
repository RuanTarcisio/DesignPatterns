package Adaptor.adaptor3.modelsImpl;

import Adaptor.adaptor3.inferfaces.CSVReader;

import java.util.ArrayList;
import java.util.List;

public class CSVReaderImpl implements CSVReader {


    @Override
    public List<String[]> readCSV(String filePath) {
        // Implementação fictícia para leitura de CSV
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"CSV Data Row 1"});
        data.add(new String[]{"CSV Data Row 2"});
        return data;
    }
}