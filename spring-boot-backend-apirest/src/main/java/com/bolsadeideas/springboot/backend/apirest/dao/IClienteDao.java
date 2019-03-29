package com.bolsadeideas.springboot.backend.apirest.dao;

import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

	Page<Cliente> findAll(Pageable pageable);

    
}