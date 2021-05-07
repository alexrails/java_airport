package academy.belhard.entity;

public class Airplanes {
    private int id;
    private String brend;
    private String model;
    private int capacity;
    private String number;

    public Airplanes(int id, String brend, String model, int capacity, String number) {
        this.id = id;
        this.brend = brend;
        this.model = model;
        this.capacity = capacity;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Airplanes{" +
                "id=" + id +
                ", brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", number='" + number + '\'' +
                '}' + "\n";
    }
}
