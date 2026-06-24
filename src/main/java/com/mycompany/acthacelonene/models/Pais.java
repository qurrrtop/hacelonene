package com.mycompany.acthacelonene.models;

import com.mycompany.acthacelonene.utils.Identifiable;

public class Pais implements Identifiable{
    
    private Long idPais;
    private String nombre;
    private Grupo grupo;

    public Pais() {
    }

    public Pais(String nombre, Grupo grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public Pais(Long idPais, String nombre, Grupo grupo) {
        this.idPais = idPais;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public Long getId() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }
@Override
    public void setId(Long idPais) {
        this.idPais = idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    
    
}
