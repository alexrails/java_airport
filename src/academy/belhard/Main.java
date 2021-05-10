package academy.belhard;

import academy.belhard.db.joiner.DataJoiner;
import academy.belhard.db.writer.AirplaneDBWriter;
import academy.belhard.db.writer.FlightDBWriter;
import academy.belhard.db.writer.PilotDBWriter;
import academy.belhard.entity.Airplane;
import academy.belhard.entity.Flight;
import academy.belhard.entity.JoinDataItem;
import academy.belhard.entity.Pilot;
import academy.belhard.io.AirplaneDataFileReader;
import academy.belhard.io.FlightDataFileReader;
import academy.belhard.io.JoinDataFileWriter;
import academy.belhard.io.PilotDataFileReader;
import academy.belhard.util.NotifyToConsoleUtil;

import java.util.List;

import static academy.belhard.io.IOConstants.*;

public class Main {

    public static void main(String[] args) {
        //READ FROM CSV
	    PilotDataFileReader pilotFileReader = new PilotDataFileReader(PILOTS_SOURCE_FILE);
        List<Pilot> pilots = pilotFileReader.read();
        AirplaneDataFileReader airplaneFileReader = new AirplaneDataFileReader(AIRPLANES_SOURCE_FILE);
        List<Airplane> airplanes = airplaneFileReader.read();
        FlightDataFileReader flightFileReader = new FlightDataFileReader(FLIGHTS_SOURCE_FILE);
        List<Flight> flights = flightFileReader.read();

        //WRITE TO DB
        NotifyToConsoleUtil.start(Pilot.class.getSimpleName());
        System.out.println(pilots);
        PilotDBWriter.insert(pilots);
        NotifyToConsoleUtil.finish(Pilot.class.getSimpleName());

        NotifyToConsoleUtil.start(Airplane.class.getSimpleName());
        System.out.println(airplanes);
        AirplaneDBWriter.insert(airplanes);
        NotifyToConsoleUtil.finish(Airplane.class.getSimpleName());

        NotifyToConsoleUtil.start(Flight.class.getSimpleName());
        System.out.println(flights);
        FlightDBWriter.insert(flights);
        NotifyToConsoleUtil.finish(Flight.class.getSimpleName());

        //JOIN AND WRITE TO FILE
        List<JoinDataItem> items  = DataJoiner.getJoinedData();

        System.out.println(items);

        JoinDataFileWriter dataFileWriter = new JoinDataFileWriter(RESULT_FILE);
        dataFileWriter.write(items);

    }
}
