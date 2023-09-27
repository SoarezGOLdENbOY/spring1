package com.senai.Daniel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Daniel.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
