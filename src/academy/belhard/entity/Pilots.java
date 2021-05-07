package academy.belhard.entity;

public class Pilots {
    private int id;
    private String firstname;
    private String lastname;
    private Rang rang;
    private String code;

    public Pilots(int id, String firstname, String lastname, Rang rang, String code) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.rang = rang;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Rang getRang() {
        return rang;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setRang(Rang rang) {
        this.rang = rang;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rang='" + rang + '\'' +
                ", code='" + code + '\'' +
                '}' + "\n";
    }
}
