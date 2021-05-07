package academy.belhard.util;

import academy.belhard.entity.Flight;

import java.time.LocalDate;
import java.time.LocalTime;

import static academy.belhard.io.IOConstants.DELIMITER;

public class FlightUtil {
    public static Flight toObject(String line) {
        String[] flightArr = line.split(DELIMITER);

        int id = Integer.parseInt(flightArr[0]);
        int airplaneId = Integer.parseInt(flightArr[1]);
        int pilotId = Integer.parseInt(flightArr[2]);
        LocalDate departure_date = LocalDate.parse(flightArr[3]);
        LocalTime departure_time = LocalTime.parse(flightArr[4]);
        String flight_number = flightArr[5];

        return new Flight(id, airplaneId, pilotId, departure_date, departure_time, flight_number);
    }
}
