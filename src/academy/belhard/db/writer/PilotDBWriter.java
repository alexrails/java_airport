package academy.belhard.db.writer;

import academy.belhard.db.DBConnector;
import academy.belhard.entity.Pilot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PilotDBWriter {
    public static final String INSERT = "INSERT INTO pilots (id, firstname, lastname, rang, code) VALUES(?,?,?,?,?)";

    public static void insert(List<Pilot> pilots) {
        for (Pilot pilot : pilots) {
            insert(pilot);
        }
    }

    private static void insert(Pilot pilot) {
        Connection connection = DBConnector.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, pilot.getId());
            statement.setString(2, pilot.getFirstname());
            statement.setString(3, pilot.getLastname());
            statement.setString(4, pilot.getRang().name());
            statement.setString(5, pilot.getCode());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
