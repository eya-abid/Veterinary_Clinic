package com.example.demo.repositories;

import com.example.demo.entities.ClientEntity;
import com.example.demo.services.ClientService;
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
public class ClientTest {
    @Autowired
    private ClientService clientService;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveClientTest(ClientEntity client){

        clientService.saveClient(client);
        Assertions.assertThat(client.getId()).isGreaterThan(0);
    }
    @Test
    @Order(2)
    public void findClientTest(){

        ClientEntity newClient = clientService.findClientById(1L);
        Assertions.assertThat(newClient.getId()).isEqualTo(1L);
    }
    @Test
    @Order(3)
    public void findAllClients(){
        List<ClientEntity> clients = (List<ClientEntity>) clientService.findAllClients();
        Assertions.assertThat(clients.size()).isGreaterThan(0);
    }

}