package br.com.polidev.provavirtual.repository;

import br.com.polidev.provavirtual.model.Usuario;
import br.com.polidev.provavirtual.repository.generic.GenericRepositoryImpl;
import jakarta.ejb.Stateless;
import jakarta.persistence.Query;
import java.util.List;

@Stateless
public class UsuarioRepositoryImpl extends GenericRepositoryImpl<Usuario> implements UsuarioRepository {

    public List teste() {
        Query query = em.createQuery("SELECT obj FROM Usuario obj");
        return query.getResultList();
    }
}
