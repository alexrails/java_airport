package academy.belhard.db.writer;

import academy.belhard.db.DBConnector;
import academy.belhard.entity.Flight;
import academy.belhard.entity.Pilot;
import academy.belhard.util.NotifyToConsoleUtil;

import java.sql.*;
import java.util.List;

public class FlightDBWriter {
    public static final String INSERT = "INSERT INTO flights (id, airplane_id, pilot_id, departure_date, departure_time, flight_number) VALUES(?,?,?,?,?,?)";

    public static void insert(List<Flight> flights) {
        for (Flight flight : flights) {
            insert(flight);
        }
    }

    private static void insert(Flight flight) {
        Connection connection = DBConnector.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, flight.getId());
            statement.setInt(2, flight.getAirplaneId());
            statement.setInt(3, flight.getPilotId());
            statement.setDate(4, Date.valueOf(flight.getDeparture_date()));
            statement.setTime(5, Time.valueOf(flight.getDeparture_time()));
            statement.setString(6, flight.getFlight_number());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
