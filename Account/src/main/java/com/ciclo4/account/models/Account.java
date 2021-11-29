package com.ciclo4.account.models;

import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private String username;
    private Integer edad;
    private String documento;
    private String celular;

    public Account(String username, Integer edad, String documento, String celular){
        this.username = username;
        this.edad = edad;
        this.documento = documento;
        this.celular = celular;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCelular() { return celular; }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
