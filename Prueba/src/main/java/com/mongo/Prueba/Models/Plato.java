package com.mongo.Prueba.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "plato")
public class Plato {

    private String nombreplato;
    private String descripcion;
    private double precio;

}
