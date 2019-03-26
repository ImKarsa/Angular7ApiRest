package com.bolsadeideas.springboot.backend.apirest.service;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.dao.IClienteDao;
import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
    
}