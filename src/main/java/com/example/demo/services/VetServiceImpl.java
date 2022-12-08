package com.example.demo.services;

import com.example.demo.entities.VetEntity;
import com.example.demo.repositories.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VetServiceImpl implements VetService {

    @Autowired
    private VetRepository vetRepository;


    /**
     * @param vet
     * @return
     */
    @Override
    public VetEntity saveVet(VetEntity vet) {
        return vetRepository.save(vet);
    }

    /**
     * @param vetId
     * @return
     */
    @Override
    public VetEntity findVetById(Long vetId) {
        Optional<VetEntity> vetOptional = vetRepository.findById(vetId);
        if (vetOptional.isPresent()) {
            return vetOptional.get();
        }
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<VetEntity> findAllVets() {
        return (List<VetEntity>) vetRepository.findAll();
    }

    /**
     * @param vet
     * @return
     */
    @Override
    public VetEntity updateVet(VetEntity vet) {
        return vetRepository.save(vet);
    }

    /**
     * @param vetId
     */
    @Override
    public void deleteVet(Long vetId) {
        vetRepository.deleteById(vetId);
    }
}