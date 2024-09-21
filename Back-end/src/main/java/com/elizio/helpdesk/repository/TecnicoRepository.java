package com.elizio.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elizio.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
