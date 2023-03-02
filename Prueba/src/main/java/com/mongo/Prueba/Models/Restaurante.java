package com.mongo.Prueba.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "restaurante")
public class Restaurante {

    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;


    private List<Carta> cartaList;

}
