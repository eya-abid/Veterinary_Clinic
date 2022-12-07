package com.example.demo.services;

import com.example.demo.entities.VetEntity;
import com.example.demo.repositories.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetServiceImpl implements VetService {

    @Autowired
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void addVet(VetEntity vet) {
        vetRepository.save(vet);
    }

    @Override
    public void deleteVet(long id) {
        vetRepository.deleteById(id);
    }

}