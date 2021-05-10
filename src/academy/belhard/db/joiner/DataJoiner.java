package academy.belhard.db.joiner;

import academy.belhard.db.DBConnector;
import academy.belhard.entity.JoinDataItem;
import academy.belhard.util.JoinDataItemUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataJoiner {
    public static final String QUERY = "SELECT fl.id, fl.flight_number, fl.departure_date, fl.departure_time, air.number, air.brend, air.model, air.capacity, p.firstname, p.lastname, p.code, p.rang " +
            "FROM flights AS fl " +
            "INNER JOIN airplanes AS air " +
            "ON fl.airplane_id = air.id " +
            "INNER JOIN pilots AS p " +
            "ON fl.pilot_id = p.id";

    public static List<JoinDataItem> getJoinedData() {
        List<JoinDataItem> result = null;

        Connection connection = DBConnector.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(QUERY)) {
            ResultSet resultSet = statement.executeQuery();
            result = JoinDataItemUtil.parseResultSet(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
