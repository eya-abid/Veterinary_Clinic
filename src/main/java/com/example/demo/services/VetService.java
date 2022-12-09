package com.example.demo.services;

import com.example.demo.entities.VetEntity;

import java.util.List;

public interface VetService {
    VetEntity saveVet(VetEntity vet);

    VetEntity findVetById(Long vetId);

    VetEntity updateVet(VetEntity vet);

    void deleteVet(Long vetId);
}
