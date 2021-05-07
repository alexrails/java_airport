package academy.belhard.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Flights {
    private int id;
    private int airplaneId;
    private int pilotId;
    private LocalDate departure_date;
    private LocalTime departure_time;
    private String flight_number;

    public Flights(int id, int airplaneId, int pilotId, String departure_date, String departure_time, String flight_number) {
        this.id = id;
        this.airplaneId = airplaneId;
        this.pilotId = pilotId;
        this.departure_date = LocalDate.parse(departure_date);
        this.departure_time = LocalTime.parse(departure_time);
        this.flight_number = flight_number;
    }

    public int getId() {
        return id;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public int getPilotId() {
        return pilotId;
    }

    public LocalDate getDeparture_date() {
        return departure_date;
    }

    public LocalTime getDeparture_time() {
        return departure_time;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public void setPilotId(int pilotId) {
        this.pilotId = pilotId;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = LocalDate.parse(departure_date);
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = LocalTime.parse(departure_time);
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", airplaneId=" + airplaneId +
                ", pilotId=" + pilotId +
                ", departure_date=" + departure_date +
                ", departure_time=" + departure_time +
                ", flight_number='" + flight_number + '\'' +
                '}' + "\n";
    }
}
