package com.mongo.Prueba.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "carta")
public class Carta {

    private String nombre;
    private String categoria;
    private int cantidad;

    private List<Plato> platoList;

}
