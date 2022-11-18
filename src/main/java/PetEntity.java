import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")

@Entity
@Table(name="pet")
public class PetEntity implements Serializable{

	@Id
	private long id;
	private String name;
	private String species;
	private String breed;
	
	@OneToOne
	private AppointmentEntity appointment;
	
	@ManyToOne
	private ClientEntity client;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppointmentEntity getAppointment() {
		return appointment;
	}

	public void setAppointment(AppointmentEntity appointment) {
		this.appointment = appointment;
	}

	public ClientEntity getClient() {
		return client;
	}

	public void setClient(ClientEntity client) {
		this.client = client;
	}
    
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return name+": "+breed;
    }
    
	public PetEntity() {
		// TODO Auto-generated constructor stub
	}

}
