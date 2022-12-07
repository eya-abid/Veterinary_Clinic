package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")


@Entity
@Table(name="client")
public class ClientEntity implements Serializable{
	
	@Id 
	private long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	@OneToMany(mappedBy="client")
	private List<PetEntity> pets;
	
	public List<PetEntity> getPets() {
		return pets;
	}

	public void setPets(List<PetEntity> pets) {
		this.pets = pets;
	}

	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
	public ClientEntity() {
		// TODO Auto-generated constructor stub
	}

}
