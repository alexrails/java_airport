package academy.belhard.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class JoinDataItem {
    private int id;
    private String flightNumber;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private String airplaneNumber;
    private String brendWithModel;
    private int capacity;
    private String pilotName;
    private String codeWithRang;

    public JoinDataItem(int id, String flightNumber, LocalDate flightDate, LocalTime flightTime, String airplaneNumber, String brendWithModel, int capacity, String pilotName, String codeWithRang) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.airplaneNumber = airplaneNumber;
        this.brendWithModel = brendWithModel;
        this.capacity = capacity;
        this.pilotName = pilotName;
        this.codeWithRang = codeWithRang;
    }

    public int getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }

    public String getAirplaneNumber() {
        return airplaneNumber;
    }

    public String getBrendWithModel() {
        return brendWithModel;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPilotName() {
        return pilotName;
    }

    public String getCodeWithRang() {
        return codeWithRang;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public void setFlightTime(LocalTime flightTime) {
        this.flightTime = flightTime;
    }

    public void setAirplaneNumber(String airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }

    public void setBrendWithModel(String brendWithModel) {
        this.brendWithModel = brendWithModel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public void setCodeWithRang(String codeWithRang) {
        this.codeWithRang = codeWithRang;
    }

    @Override
    public String toString() {
        return "JoinDataItem{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightDate=" + flightDate +
                ", flightTime=" + flightTime +
                ", airplaneNumber='" + airplaneNumber + '\'' +
                ", brendWithModel='" + brendWithModel + '\'' +
                ", capacity=" + capacity +
                ", pilotName='" + pilotName + '\'' +
                ", codeWithRang='" + codeWithRang + '\'' +
                '}' + "\n";
    }
}
