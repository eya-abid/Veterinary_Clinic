package com.example.demo.services;

import com.example.demo.entities.SurgeryEntity;
import com.example.demo.repositories.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurgeryServiceImpl implements SurgeryService {


    private SurgeryRepository surgeryRepository;

    /**
     * @param surgery
     * @return
     */
    @Override
    public SurgeryEntity saveSurgery(SurgeryEntity surgery) {
        return surgeryRepository.save(surgery);
    }

    /**
     * @param surgeryId
     * @return
     */
    @Override
    public SurgeryEntity findSurgeryById(Long surgeryId) {
        Optional<SurgeryEntity> surgeryOptional = surgeryRepository.findById(surgeryId);
        if (surgeryOptional.isPresent()) {
            return surgeryOptional.get();
        }
        return null;
    }


    /**
     * @param surgery
     * @return
     */
    @Override
    public SurgeryEntity updateSurgery(SurgeryEntity surgery) {
        return surgeryRepository.save(surgery);
    }

    /**
     * @param surgeryId
     */
    @Override
    public void deleteSurgery(Long surgeryId) {
        surgeryRepository.deleteById(surgeryId);
    }
}