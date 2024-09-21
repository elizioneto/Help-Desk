package com.elizio.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elizio.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
