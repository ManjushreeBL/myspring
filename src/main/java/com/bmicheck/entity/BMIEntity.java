package com.bmicheck.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@RequiredArgsConstructor
public class BMIEntity {
    private Integer height;
    private Integer weight;
    private Integer BMIIndex;

    public BMIEntity(Integer height, Integer weight) {
    }

    public Integer setBMIIndex( Integer height,Integer weight){
        Integer value=this.weight/(this.height/100)*(this.height/100);

        return value;
    }
}
