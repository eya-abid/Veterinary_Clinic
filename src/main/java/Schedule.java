public class Schedule {
    public long id;
    public long medic_id;
    public String start_hour;
    public String end_hour;
    public String day;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMedic_id() {
        return medic_id;
    }

    public void setMedic_id(long medic_id) {
        this.medic_id = medic_id;
    }

    public String getStart_hour() {
        return start_hour;
    }

    public void setStart_hour(String start_hour) {
        this.start_hour = start_hour;
    }

    public String getEnd_hour() {
        return end_hour;
    }

    public void setEnd_hour(String end_hour) {
        this.end_hour = end_hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
