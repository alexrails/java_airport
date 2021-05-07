package academy.belhard.io;

import academy.belhard.entity.Airplane;
import academy.belhard.exception.EmptySourceFile;
import academy.belhard.util.AirplaneUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirplaneDataFileReader {
    private String filepath;

    public AirplaneDataFileReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Airplane> read() {
        List<Airplane> airplanes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            checkFile();

            String line;
            while ((line = reader.readLine()) != null) {
                Airplane airplane = AirplaneUtil.toObject(line);
                airplanes.add(airplane);
            }

        } catch (IOException | EmptySourceFile e) {
            e.printStackTrace();
        }

        return airplanes;
    }

    private void checkFile() throws EmptySourceFile {
        File sourceFile = new File(filepath);

        if (sourceFile.length() == 0) {
            throw new EmptySourceFile("Файл пуст");
        }
    }
}
