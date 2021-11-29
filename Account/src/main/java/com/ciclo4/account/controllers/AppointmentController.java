package com.ciclo4.account.controllers;

import com.ciclo4.account.exceptions.AccountNotFoundException;
import com.ciclo4.account.models.Account;
import com.ciclo4.account.models.Appointment;
import com.ciclo4.account.repositories.AccountRepository;
import com.ciclo4.account.repositories.AppointmentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class AppointmentController {

    private final AccountRepository accountRepository;
    private final AppointmentRepository appointmentRepository;

    public AppointmentController (AccountRepository accountRepository, AppointmentRepository appointmentRepository){
        this.accountRepository = accountRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @PostMapping("/appointment")
    Appointment newAppointment (@RequestBody Appointment appointment) {

        Account username = accountRepository.findById(appointment.getUsername()).orElse(null);

        if(username == null)
            throw new AccountNotFoundException("No se encuentra registrado el paciente " + appointment.getUsername());

        return appointmentRepository.save(appointment); }

    @GetMapping("/appointment/{username}")
    List<Appointment> userAppointment (@PathVariable String username){
        Account userAccount = accountRepository.findById(username).orElse(null);

        if (userAccount == null)
            throw new AccountNotFoundException("No se encuentra registrado el paciente " + username);

        List<Appointment> usernameOrigin = appointmentRepository.findByUsername(username);

        List<Appointment> appointments = usernameOrigin;

        return appointments;
    }

}
