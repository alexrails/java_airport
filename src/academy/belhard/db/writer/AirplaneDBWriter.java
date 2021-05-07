package academy.belhard.db.writer;

import academy.belhard.db.DBConnector;
import academy.belhard.entity.Airplane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AirplaneDBWriter {
    public static final String INSERT = "INSERT INTO airplanes (id, brend, model, capacity, number) VALUES(?,?,?,?,?)";

    public static void insert(List<Airplane> airplanes) {
        for (Airplane airplane : airplanes) {
            insert(airplane);
        }
    }

    private static void insert(Airplane airplane) {
        Connection connection = DBConnector.getConnection();

        try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setInt(1, airplane.getId());
            statement.setString(2, airplane.getBrend());
            statement.setString(3, airplane.getModel());
            statement.setInt(4, airplane.getCapacity());
            statement.setString(5, airplane.getNumber());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
