package com.example.demo.services;

import com.example.demo.entities.PetEntity;
import com.example.demo.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service("userService")
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    /**
     * @param pet
     * @return
     */
    @Override
    public PetEntity savePet(PetEntity pet) {
        return petRepository.save(pet);
    }

    /**
     * @param petId
     * @return
     */
    @Override
    public PetEntity findPetById(Long petId) {
        Optional<PetEntity> petOptional = petRepository.findById(petId);
        if (petOptional.isPresent()) {
            return petOptional.get();
        }
        return null;
    }

    /**
     * @return
     */
    @Override
    public List<PetEntity> findAllPets() {
        return (List<PetEntity>) petRepository.findAll();
    }

    /**
     * @param pet
     * @return
     */
    @Override
    public PetEntity updateUser(PetEntity pet) {
        return petRepository.save(pet);
    }

    /**
     * @param petId
     */
    @Override
    public void deletePet(Long petId) {
        petRepository.deleteById(petId);
    }
}
