public class Appointment {
    public long id;
    public long id_client;
    public long id_animal;
    public long id_medic;
    public String date;
    public String hour;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_client() {
        return id_client;
    }

    public void setId_client(long id_client) {
        this.id_client = id_client;
    }

    public long getId_animal() {
        return id_animal;
    }

    public void setId_animal(long id_animal) {
        this.id_animal = id_animal;
    }

    public long getId_medic() {
        return id_medic;
    }

    public void setId_medic(long id_medic) {
        this.id_medic = id_medic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
