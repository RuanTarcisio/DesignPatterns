package Adaptor.adaptor3.modelsImpl;

import Adaptor.adaptor3.inferfaces.XMLReader;

import java.util.ArrayList;
import java.util.List;

public class XMLReaderImpl implements XMLReader {

    @Override
    public List<String> readXML(String filePath) {
        // Implementação fictícia para leitura de XML
        List<String> data = new ArrayList<>();
        data.add("XML Data Row 1");
        data.add("XML Data Row 2");
        return data;
    }

}