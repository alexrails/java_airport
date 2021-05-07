package academy.belhard;

import academy.belhard.entity.Pilot;
import academy.belhard.io.AirplaneDataFileReader;
import academy.belhard.io.FlightDataFileReader;
import academy.belhard.io.PilotDataFileReader;

import java.util.List;

import static academy.belhard.io.IOConstants.*;

public class Main {

    public static void main(String[] args) {
        //READ FROM CSV
	    PilotDataFileReader pilotFileReader = new PilotDataFileReader(PILOTS_SOURCE_FILE);
        System.out.println(pilotFileReader.read());
        AirplaneDataFileReader airplaneFileReader = new AirplaneDataFileReader(AIRPLANES_SOURCE_FILE);
        System.out.println(airplaneFileReader.read());
        FlightDataFileReader flightFileReader = new FlightDataFileReader(FLIGHTS_SOURCE_FILE);
        System.out.println(flightFileReader.read());

    }
}
