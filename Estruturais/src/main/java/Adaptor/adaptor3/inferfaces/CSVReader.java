package Adaptor.adaptor3.inferfaces;

import java.util.List;

public interface CSVReader {
    List<String[]> readCSV(String filePath);
}