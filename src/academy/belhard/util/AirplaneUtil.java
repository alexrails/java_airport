package academy.belhard.util;

import academy.belhard.entity.Airplane;
import academy.belhard.entity.Rang;

import static academy.belhard.io.IOConstants.DELIMITER;

public class AirplaneUtil {
    public static Airplane toObject(String line) {
        String[] airplaneArr = line.split(DELIMITER);

        int id = Integer.parseInt(airplaneArr[0]);
        String brend = airplaneArr[1];
        String model = airplaneArr[2];
        int capacity = Integer.parseInt(airplaneArr[3]);
        String number = airplaneArr[4];

        return new Airplane(id, brend, model, capacity, number);
    }
}
