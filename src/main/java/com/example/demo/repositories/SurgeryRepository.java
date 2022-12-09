package com.example.demo.repositories;

import com.example.demo.entities.SurgeryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends CrudRepository<SurgeryEntity, Long> {
}
