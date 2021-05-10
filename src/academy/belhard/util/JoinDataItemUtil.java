package academy.belhard.util;

import academy.belhard.entity.JoinDataItem;

import academy.belhard.io.IOConstants;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class JoinDataItemUtil {
    public static List<JoinDataItem> parseResultSet(ResultSet resultSet) throws SQLException {
        List<JoinDataItem> items = new ArrayList<>();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String flightNumber = resultSet.getString("flight_number");
            LocalDate flightDate = resultSet.getDate("departure_date").toLocalDate();
            LocalTime flightTime = resultSet.getTime("departure_time").toLocalTime();
            String airplaneNumber = resultSet.getString("number");
            String brendWithModel = resultSet.getString("brend") + " " + resultSet.getString("model");
            int capacity = resultSet.getInt("capacity");
            String pilotName = resultSet.getString("lastname") + " " + String.valueOf((resultSet.getString("firstname")).charAt(0)) + ".";
            String codeWithRang = resultSet.getString("code") + " (" + resultSet.getString("rang") + ")";

            JoinDataItem item = new JoinDataItem(id, flightNumber, flightDate, flightTime, airplaneNumber, brendWithModel, capacity, pilotName, codeWithRang);
            items.add(item);
        }

        return items;
    }

    public static String makeString(JoinDataItem item) {
        return item.getId() + ";"
                + item.getFlightNumber() + ";"
                + item.getFlightDate() + ";"
                + item.getFlightTime() + ";"
                + item.getAirplaneNumber() + ";"
                + item.getBrendWithModel() + ";"
                + item.getCapacity() + ";"
                + item.getPilotName() + ";"
                + item.getCodeWithRang() + "\n";
    }
}
