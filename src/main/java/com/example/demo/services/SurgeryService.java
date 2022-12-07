package com.example.demo.services;

import com.example.demo.entities.SurgeryEntity;

import java.util.List;

public interface SurgeryService {
    SurgeryEntity saveSurgery(SurgeryEntity surgery);

    SurgeryEntity findSurgeryById(Long surgeryId);

    List<SurgeryEntity> findAllSurgeries();

    SurgeryEntity updateSurgery(SurgeryEntity surgery);

    void deleteSurgery(Long surgeryId);
}