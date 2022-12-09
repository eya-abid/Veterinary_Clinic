package com.example.demo.services;

import com.example.demo.entities.ClientEntity;
import com.example.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service("ClientService")
public class ClientServiceImpl implements ClientService {


    private ClientRepository clientRepository;


    /**
     * @param client
     * @return
     */
    @Override
    public ClientEntity saveClient(ClientEntity client) {
        return clientRepository.save(client);
    }

    /**
     * @param clientId
     * @return
     */
    @Override
    public ClientEntity findClientById(Long clientId) {
        Optional<ClientEntity> clientOptional = clientRepository.findById(clientId);
        if (clientOptional.isPresent()) {
            return clientOptional.get();
        }
        return null;
    }


    /**
     * @param client
     * @return
     */
    @Override
    public ClientEntity updateUser(ClientEntity client) {
        return clientRepository.save(client);
    }

    /**
     * @param clientId
     */
    @Override
    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }
}