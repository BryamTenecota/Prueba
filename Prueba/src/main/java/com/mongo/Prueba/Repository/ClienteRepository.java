package com.mongo.Prueba.Repository;

import com.mongo.Prueba.Models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, Long> {
}

