package com.example.idade.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class IdadeController {

    @GetMapping("/{dia}/{mes}/{ano}")
    public Integer getIdade(@PathVariable Integer dia,
                        @PathVariable Integer mes,
                        @PathVariable Integer ano) throws ParseException {
        //colocar logica aqui
        String stringDate = String.format("%d/%d/%d", dia, mes, ano);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(stringDate, formatter);
        LocalDate today = LocalDate.now();

        Integer age = Period.between(localDate, today).getYears();

        return age;



    }



}
