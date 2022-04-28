package br.com.polidev.provavirtual.service;

import br.com.polidev.provavirtual.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioService {

    @Inject
    private UsuarioRepository usuario;
}
