package br.com.polidev.provavirtual.repository.generic;

import br.com.polidev.provavirtual.model.generic.GenericBase;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
public class GenericRepositoryImpl<T extends GenericBase> implements GenericRepository<T> {

    @PersistenceContext
    protected EntityManager em;
    protected Class<T> clazz;

    public GenericRepositoryImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.clazz = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T merge(T entity) {
        return em.merge(entity);
    }

    @Override
    public T findById(Long id) {
        return em.find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        return (List<T>) em.createQuery("from " + clazz.getCanonicalName()).getResultList();
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public void deleteById(Long id) {
        em.createQuery("delete from " + clazz.getClass().getCanonicalName() + " where id = " + id).executeUpdate();
    }

}
