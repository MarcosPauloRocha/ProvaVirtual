package br.com.polidev.provavirtual.repository;

import br.com.polidev.provavirtual.model.Usuario;
import br.com.polidev.provavirtual.repository.generic.GenericRepositoryImpl;
import jakarta.ejb.Stateless;

@Stateless
public class UsuarioRepositoryImpl extends GenericRepositoryImpl<Usuario> implements UsuarioRepository{
    

}
