package com.br.appEventoEsportivos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.appEventoEsportivos.model.Usuario;
import com.br.appEventoEsportivos.service.impl.UsuarioServiceImpl;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	UsuarioServiceImpl  usuarioServiceImpl;

	@GetMapping("/insert")
	public Usuario insert(Usuario usuario) {
		return usuarioServiceImpl.save(usuario);
	}
	
	@GetMapping("/list")
	public List<Usuario> findAll() {
		return usuarioServiceImpl.findAll();
	}
	
	
//	@GetMapping("/{nome}")
//	public List<Usuario> pesquisaName(@PathVariable("nome") String nome) {
//	//	String name = "MICHELLE";
//		return usuarioRepository.pesquisaName(nome);
//	}

}