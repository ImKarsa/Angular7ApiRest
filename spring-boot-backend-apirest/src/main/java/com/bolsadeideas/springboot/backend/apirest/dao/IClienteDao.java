package com.bolsadeideas.springboot.backend.apirest.dao;

import org.springframework.data.domain.Pageable;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.entity.Region;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

	Page<Cliente> findAll(Pageable pageable);

	@Query("from Region")
	public List<Region> findAllRegiones();

    
}