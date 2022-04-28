package br.com.polidev.provavirtual.repository.generic;

import br.com.polidev.provavirtual.model.generic.GenericBase;
import java.util.List;

public interface GenericRepository<T extends GenericBase> {

    public void save(T entity);

    public T merge(T entity);

    public T findById(Long id);

    public List<T> findAll();

    public void delete(T entity);

    public void deleteById(Long id);

}
