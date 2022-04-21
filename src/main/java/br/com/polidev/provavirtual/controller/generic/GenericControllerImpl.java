package br.com.polidev.provavirtual.controller.generic;

import br.com.polidev.provavirtual.model.generic.GenericBase;
import java.util.List;



public class GenericControllerImpl<T extends GenericBase> implements GenericController<T>{
    
    private T entidade;
    private List<T> listaEntidades;

    public T getEntidade() {
        return entidade;
    }

    public void setEntidade(T entidade) {
        this.entidade = entidade;
    }

    public List<T> getListaEntidades() {
        return listaEntidades;
    }

    public void setListaEntidades(List<T> listaEntidades) {
        this.listaEntidades = listaEntidades;
    }
    
    
}