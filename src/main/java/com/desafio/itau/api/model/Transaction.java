package com.desafio.itau.api.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
@Data
public class Transaction {
    @NotNull(message = "Campo 'valor' não pode ser nulo.")
    @Min(value = 0, message = "Valor deve ser igual ou maior que 0")
    private BigDecimal valor;

    @NotNull(message = "Campo 'dataHora' não pode ser nulo.")
    @PastOrPresent(message = "Transção não pode acontecer no futuro.")
    private OffsetDateTime dataHora;

}
