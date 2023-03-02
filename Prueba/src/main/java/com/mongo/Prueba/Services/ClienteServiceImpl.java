package com.mongo.Prueba.Services;

import com.mongo.Prueba.Models.Cliente;
import com.mongo.Prueba.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Long> implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }
}
