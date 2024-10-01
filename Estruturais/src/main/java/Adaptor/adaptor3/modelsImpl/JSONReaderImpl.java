package Adaptor.adaptor3.modelsImpl;

import Adaptor.adaptor3.inferfaces.JSONReader;

import java.util.ArrayList;
import java.util.List;

public class JSONReaderImpl implements JSONReader {

    @Override
    public List<String> readJSON(String filePath) {
        // Implementação fictícia para leitura de JSON
        List<String> data = new ArrayList<>();
        data.add("JSON Data Row 1");
        data.add("JSON Data Row 2");
        return data;
    }
}