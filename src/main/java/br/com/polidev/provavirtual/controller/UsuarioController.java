package br.com.polidev.provavirtual.controller;

import br.com.polidev.provavirtual.model.Usuario;
import br.com.polidev.provavirtual.service.UsuarioService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class UsuarioController {
    
    @Inject
    private UsuarioService usuarioService;
    private Usuario usuario;
    private List<Usuario> listaUsuarios;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
