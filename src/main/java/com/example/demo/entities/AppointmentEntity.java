package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;


@SuppressWarnings("serial")
@Entity
@Table(name="appointment")
public class AppointmentEntity implements Serializable {

	@Id 
	private long id;
	private LocalDate date;
	private LocalTime hour;

	@OneToOne
	private SurgeryEntity surgery;
	
	@ManyToOne
	private VetEntity vet;
	
	@OneToOne(mappedBy="appointment")
	private PetEntity pet;
	
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public SurgeryEntity getSurgery() {
		return surgery;
	}

	public void setSurgery(SurgeryEntity surgery) {
		this.surgery = surgery;
	}

	public VetEntity getVet() {
		return vet;
	}

	public void setVet(VetEntity vet) {
		this.vet = vet;
	}

	public PetEntity getPet() {
		return pet;
	}

	public void setPet(PetEntity pet) {
		this.pet = pet;
	}

	@Override
    public String toString() {
        return "AppointmentEntity{" +
                "date=" + date +
                ", hour=" + hour +
                '}';
    }
    
	public AppointmentEntity() {
		// TODO Auto-generated constructor stub
	}

}
