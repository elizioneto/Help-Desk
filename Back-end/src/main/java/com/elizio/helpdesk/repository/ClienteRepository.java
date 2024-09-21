package com.elizio.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elizio.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
