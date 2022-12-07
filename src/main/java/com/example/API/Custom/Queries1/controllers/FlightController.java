package com.example.API.Custom.Queries1.controllers;

import com.example.API.Custom.Queries1.entities.Flight;
import com.example.API.Custom.Queries1.entities.Status;
import com.example.API.Custom.Queries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    @PostMapping("")
    public void provisioningFlights(){
        String st = Status.ONTIME.getSetStatus();
        Random random = new Random();
        for (int i = 0; i <= 49; i++) {
            Flight f = new Flight(random.ints().toString(), random.ints().toString(), random.ints().toString(), st);
            flightRepository.save(f);
        }
    }
}
