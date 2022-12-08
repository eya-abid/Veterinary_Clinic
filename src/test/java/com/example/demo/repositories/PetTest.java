package com.example.demo.repositories;

import com.example.demo.entities.ClientEntity;
import com.example.demo.entities.PetEntity;
import com.example.demo.services.PetService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import java.util.List;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PetTest {
    @Autowired
    private PetService petService;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void savePetTest(PetEntity pet){

        petService.savePet(pet);
        Assertions.assertThat(pet.getId()).isGreaterThan(0);
    }
    @Test
    @Order(2)
    public void findPetTest(){

        PetEntity newPet = petService.findPetById(1L);
        Assertions.assertThat(newPet.getId()).isEqualTo(1L);
    }
    @Test
    @Order(3)
    public void findAllPet(){
        List<PetEntity> pets = (List<PetEntity>) petService.findAllPets();
        Assertions.assertThat(pets.size()).isGreaterThan(0);
    }

}