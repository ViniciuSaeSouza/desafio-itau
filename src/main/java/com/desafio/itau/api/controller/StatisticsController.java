package com.desafio.itau.api.controller;


import com.desafio.itau.api.model.StatisticsDTO;
import com.desafio.itau.api.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping
    public StatisticsDTO getStatistics() {
        return  transactionRepository.getStatistics();
    }

}
