package parser;

import entity.Aluno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class StudentParserImpl implements CSVParser {

    @Override
    public ArrayList<?> fromCSV(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        BufferedReader buffer = Files.newBufferedReader(path);
        ArrayList<Aluno> result = new ArrayList<>();

        String line;

        while ((line = buffer.readLine()) != null) {
            String[] lineValues = line.split(",");
            Aluno aluno = new Aluno(null, lineValues[0], lineValues[1]);
            result.add(aluno);
        }

        buffer.close();

        return result;
    }

    @Override
    public boolean toCSV(String filePath, ArrayList<?> students) throws IOException {
        Path path = Paths.get(filePath);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(path);

        for (Object o : students) {
            Aluno aluno = (Aluno) o;
            String line = aluno.getId() + ',' + aluno.getDocumentNumber() + ',' + aluno.getName();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        return true;
    }
}
