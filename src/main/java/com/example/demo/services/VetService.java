package com.example.demo.services;

import com.example.demo.entities.VetEntity;

public interface VetService {
    public void addVet(VetEntity vet);
    public void deleteVet(long id);
}
