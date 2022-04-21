package br.com.polidev.provavirtual.model.generic;

import java.time.LocalDateTime;
import java.util.Objects;
import jakarta.persistence.Basic;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@MappedSuperclass
public abstract class GenericBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean ativo = true;
    private String motivoInativar;
    @Basic
    private LocalDateTime dataCadastro = LocalDateTime.now();
    @Basic
    private LocalDateTime ultimaAtualizacao = LocalDateTime.now();

    public GenericBase() {
    }

    public Long getId() {
        return id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getMotivoInativar() {
        return motivoInativar;
    }

    public void setMotivoInativar(String motivoInativar) {
        this.motivoInativar = motivoInativar;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao() {
        this.ultimaAtualizacao = LocalDateTime.now();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.ativo);
        hash = 79 * hash + Objects.hashCode(this.motivoInativar);
        hash = 79 * hash + Objects.hashCode(this.dataCadastro);
        hash = 79 * hash + Objects.hashCode(this.ultimaAtualizacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GenericBase other = (GenericBase) obj;
        if (!Objects.equals(this.motivoInativar, other.motivoInativar)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ativo, other.ativo)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        return Objects.equals(this.ultimaAtualizacao, other.ultimaAtualizacao);
    }

    




}
