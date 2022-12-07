package com.example.demo.services;

import com.example.demo.entities.PetEntity;

import java.util.List;

public interface PetService {
    PetEntity savePet(PetEntity pet);

    PetEntity findPetById(Long petId);

    List<PetEntity> findAllPets();

    PetEntity updateUser(PetEntity pet);

    void deletePet(Long petId);
}