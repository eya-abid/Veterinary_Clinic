package com.example.demo.services;

import com.example.demo.entities.ClientEntity;

public interface ClientService {
    ClientEntity saveClient(ClientEntity client);

    ClientEntity findClientById(Long clientId);

    ClientEntity updateUser(ClientEntity client);

    void deleteClient(Long clientId);
}