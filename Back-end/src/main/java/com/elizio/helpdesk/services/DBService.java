package com.elizio.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.elizio.helpdesk.domain.Chamado;
import com.elizio.helpdesk.domain.Cliente;
import com.elizio.helpdesk.domain.Tecnico;
import com.elizio.helpdesk.domain.enums.Perfil;
import com.elizio.helpdesk.domain.enums.Prioridade;
import com.elizio.helpdesk.domain.enums.Status;
import com.elizio.helpdesk.repository.ChamadoRepository;
import com.elizio.helpdesk.repository.PessoaRepository;

@Service
public class DBService {

	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Elizio Neto", "550.482.150-95", "elizio@mail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Oliveira Neto", "903.347.070-56", "oliveira@mail.com",
				encoder.encode("123"));
		Tecnico tec3 = new Tecnico(null, "Maria Joanilda", "271.068.470-54", "joaninha@mail.com",
				encoder.encode("123"));
		Tecnico tec4 = new Tecnico(null, "gulira", "162.720.120-39", "guliramail.com", encoder.encode("123"));
		Tecnico tec5 = new Tecnico(null, "D gil", "778.556.170-27", "Dgil@mail.com", encoder.encode("123"));

		Cliente cli1 = new Cliente(null, "Diva maria", "111.661.890-74", "diva@mail.com", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Maria j", "322.429.140-06", "maria@mail.com", encoder.encode("123"));
		Cliente cli3 = new Cliente(null, "leleke do bacanal", "792.043.830-62", "bacanal@mail.com",
				encoder.encode("123"));
		Cliente cli4 = new Cliente(null, "limoeiro", "177.409.680-30", "limoeiro@mail.com", encoder.encode("123"));
		Cliente cli5 = new Cliente(null, "ferreiros", "081.399.300-83", "ferreiros@mail.com", encoder.encode("123"));

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Teste chamado 1", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste chamado 2", tec1, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste chamado 3", tec2, cli3);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste chamado 4", tec3, cli3);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 5", "Teste chamado 5", tec2, cli1);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 7", "Teste chamado 6", tec1, cli5);

		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
		
	}
}
