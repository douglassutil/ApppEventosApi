package com.br.appEventoEsportivos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.appEventoEsportivos.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
//	Usuario findById(long id);
//
//	@Query(value = "select * from usuario where nome like %?1%  or user_name like %?1%", nativeQuery = true)
//	List<Usuario> pesquisaName(String name);

}
