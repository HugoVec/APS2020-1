package parser;

import java.io.*;
import java.util.ArrayList;

interface CSVParser {
    ArrayList<?> fromCSV(String filePath) throws IOException;
    boolean toCSV(String filePath, ArrayList<?> entities) throws IOException;
}
