package com.bmicheck.entity;

import lombok.*;

@Data
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
public class BMIEntity {
    private Float height;
    private Float weight;
    private Float BMIIndex;


    public BMIEntity(Float height, Float weight){
        this.height=height;
        this.weight=weight;
    }



}
