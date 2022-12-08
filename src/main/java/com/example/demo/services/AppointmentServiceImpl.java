package com.example.demo.services;
import com.example.demo.entities.AppointmentEntity;
import com.example.demo.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Transactional
@Service("AppointmentService")
public class AppointmentServiceImpl implements AppointmentService {


    private AppointmentRepository appointmentRepository;

    /**
         * @param appointment
         * @return
     */

    @Override
    public AppointmentEntity saveAppointment(AppointmentEntity appointment) {
        return appointmentRepository.save(appointment);
    }

    /**
         * @param appointmentId
         * @return
     */
    @Override
    public AppointmentEntity findAppointmentById(Long appointmentId) {
        Optional<AppointmentEntity> appointmentOptional = appointmentRepository.findById(appointmentId);
        if (appointmentOptional.isPresent()){
            return  appointmentOptional.get();
        }
        return null;
    }


        /**
         * @param appointment
         * @return
         */
        @Override
        public AppointmentEntity updateAppointment(AppointmentEntity appointment) {
            return appointmentRepository.save(appointment);
        }

        /**
         * @param appointmentId
         */
        @Override
        public void deleteAppointment(Long appointmentId) {
            appointmentRepository.deleteById(appointmentId);
        }
    }