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

    public BMIIndex getBMIIndex(height,weight){
        return (this.weight/(this.height/100)**2);
    }
}
