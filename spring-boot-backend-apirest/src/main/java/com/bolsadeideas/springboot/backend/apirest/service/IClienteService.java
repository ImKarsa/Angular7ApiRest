package com.bolsadeideas.springboot.backend.apirest.service;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

public interface IClienteService {

    public List<Cliente> findAll();
    
}