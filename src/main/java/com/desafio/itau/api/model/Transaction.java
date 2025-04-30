package com.desafio.itau.api.model;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transaction {

    @NotNull(message = "Campo 'valor' não pode ser nulo.")
    @Min(value = 0)
    private BigDecimal valor;

    @NotNull(message = "Campo 'dataHora' não pode ser nulo.")
    @PastOrPresent(message = "Transção não pode acontecer no futuro.")
    private OffsetDateTime dataHora;

}
