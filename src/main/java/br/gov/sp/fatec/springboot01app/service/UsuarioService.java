package br.gov.sp.fatec.springboot01app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot01app.entity.Usuario;
import br.gov.sp.fatec.springboot01app.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepo;

    public Usuario novoUsuario(Usuario usuario){
        if(usuario == null ||
                usuario.getNome() == null ||
                usuario.getNome().isBlank() ||
                usuario.getSenha() == null ||
                usuario.getSenha().isBlank()){
                    throw new IllegalArgumentException("Dados Inválidos!");
                }
                return usuarioRepo.save(usuario);
    }

    public List<Usuario> buscarTodosUsuarios(){
        return usuarioRepo.findAll();
    }

    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuarioOp = usuarioRepo.findById(id);
        if(usuarioOp.isEmpty()) {
            throw new IllegalArgumentException("Usuario nao encontrado!");
        }
        return usuarioOp.get();
    }
}
