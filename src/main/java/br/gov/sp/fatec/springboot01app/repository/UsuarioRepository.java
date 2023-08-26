package br.gov.sp.fatec.springboot01app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springboot01app.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
