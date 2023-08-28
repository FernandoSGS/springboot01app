package br.gov.sp.fatec.springboot01app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springboot01app.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{
    
}
