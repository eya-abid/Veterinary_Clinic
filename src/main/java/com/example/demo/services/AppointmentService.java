package com.example.demo.services;

import com.example.demo.entities.AppointmentEntity;

import java.util.List;

public interface AppointmentService {
    AppointmentEntity saveAppointment(AppointmentEntity appointment);

    AppointmentEntity findAppointmentById(Long appointmentId);

    AppointmentEntity updateAppointment(AppointmentEntity appointment);

    void deleteAppointment(Long appointmentId);
}