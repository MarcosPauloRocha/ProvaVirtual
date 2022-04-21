package br.com.polidev.provavirtual;

import br.com.polidev.provavirtual.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setLogin("postgres");
        usuario.setSenha("admin");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("provavirtualPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
