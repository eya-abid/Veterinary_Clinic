import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")

@Entity
@Table(name="surgery")
public class SurgeryEntity implements Serializable {

	@Id
	private long id;
	private String name;
	private Integer price;
	
	@OneToOne ( mappedBy="surgery" )
	private AppointmentEntity appointment;
	
    public AppointmentEntity getAppointment() {
		return appointment;
	}

	public void setAppointment(AppointmentEntity appointment) {
		this.appointment = appointment;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
    
	public SurgeryEntity() {
		// TODO Auto-generated constructor stub
	}

}
