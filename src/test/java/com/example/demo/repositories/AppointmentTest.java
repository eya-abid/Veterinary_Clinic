package com.example.demo.repositories;

import com.example.demo.entities.AppointmentEntity;
import com.example.demo.services.AppointmentService;
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
public class AppointmentTest {
    @Autowired
    private AppointmentService appointmentService;

    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveAppointmentTest(AppointmentEntity appointment){

        appointmentService.saveAppointment(appointment);
        Assertions.assertThat(appointment.getId()).isGreaterThan(0);
    }
    @Test
    @Order(2)
    public void findAppointmentTest(){

        AppointmentEntity newAppointment = appointmentService.findAppointmentById(1L);
        Assertions.assertThat(newAppointment.getId()).isEqualTo(1L);
    }
    @Test
    @Order(3)
    public void findAllAppointments(){
        List<AppointmentEntity> appointments = appointmentService.findAllAppointments();
        Assertions.assertThat(appointments.size()).isGreaterThan(0);
    }

}