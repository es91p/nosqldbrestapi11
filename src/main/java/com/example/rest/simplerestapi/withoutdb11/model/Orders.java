package com.example.rest.simplerestapi.withoutdb11.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Orders {

    private Integer id;
    private String name;
    private Double price;
    private Integer qty;

}
