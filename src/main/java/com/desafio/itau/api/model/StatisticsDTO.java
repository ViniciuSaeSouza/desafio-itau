package com.desafio.itau.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StatisticsDTO {
    private Integer count;
    private Double sum;
    private Double avg;
    private Double min;
    private Double max;
}


