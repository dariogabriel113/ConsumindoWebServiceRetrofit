package com.dariogabriellsilva.consumindowebserviceretrofit.model;

import android.support.annotation.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"codibge", "codestado"})
public class CEP {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    @NonNull
    @Override
    public String toString() {
        return "CEP: " + cep
                + "\nLogradouro: " + logradouro
                + "\nComplemento: " + complemento
                + "\nBairro: " + bairro
                + "\nCidade: " + cidade
                + "\nEstado: " + estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
