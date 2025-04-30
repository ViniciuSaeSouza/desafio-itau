package com.desafio.itau.api.controller;

import com.desafio.itau.api.model.Transaction;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransactionController {
    List<Transaction> transactionList = new ArrayList<>();

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Transaction> index () {
        return transactionList;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private void create(@RequestBody @Valid Transaction transaction) {
        transactionList.add(transaction);
    }
}
