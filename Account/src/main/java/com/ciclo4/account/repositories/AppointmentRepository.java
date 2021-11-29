package com.ciclo4.account.repositories;

import com.ciclo4.account.models.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface AppointmentRepository extends MongoRepository <Appointment, String> {
    List<Appointment> findByUsername (String history);
}