package com.desafio.itau.api.controller;

import com.desafio.itau.api.model.TransactionDTO;
import com.desafio.itau.api.repository.TransactionRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TransactionDTO> index() {
        return transactionRepository.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid TransactionDTO transactionDTO) {
        transactionRepository.create(transactionDTO);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteAll() {
        transactionRepository.deleteAll();
    }
}
