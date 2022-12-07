package com.example.demo.repositories;
import com.example.demo.entities.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository <ClientEntity, Long> {
}
