package com.desafio.itau.api.repository;

import com.desafio.itau.api.model.StatisticsDTO;
import com.desafio.itau.api.model.TransactionDTO;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TransactionRepository {

    private List<TransactionDTO> transactionDTOList = new ArrayList<>();


    public List<TransactionDTO> getAll() {
        return transactionDTOList;
    }

    public void create(TransactionDTO transactionDTO) {
        transactionDTOList.add(transactionDTO);
    }

    public void deleteAll() {
        transactionDTOList = new ArrayList<>();
    }

    public StatisticsDTO getStatistics() {

        var validStats = transactionDTOList.stream()
                .filter(t -> t.getDataHora().isAfter(OffsetDateTime.now().minusMinutes(1)))
                .collect(Collectors.summarizingDouble(value -> value.getValor().doubleValue()));

        return StatisticsDTO.builder()
                .count((int) (validStats.getCount()))
                .sum(validStats.getSum())
                .avg(validStats.getAverage())
                .min(validStats.getMin())
                .max(validStats.getMax())
                .build();
    }
}
