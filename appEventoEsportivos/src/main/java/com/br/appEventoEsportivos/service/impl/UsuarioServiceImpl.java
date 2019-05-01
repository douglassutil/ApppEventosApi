package com.br.appEventoEsportivos.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.appEventoEsportivos.model.Usuario;
import com.br.appEventoEsportivos.repository.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioServiceImpl {

	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario findById(Long idUsuario) {
		Optional<Usuario> usuario = usuarioRepository.findById(idUsuario);
		if (usuario.isPresent())
			return usuario.get();
		return null;
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}
