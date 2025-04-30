package com.desafio.itau.api.controller;

import com.desafio.itau.api.model.Transaction;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransactionController {
    List<Transaction> transactionList = new ArrayList<>();

    @PostMapping
    private ResponseEntity<Void> create(@RequestBody @Valid Transaction transaction) {
        transactionList.add(transaction);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
