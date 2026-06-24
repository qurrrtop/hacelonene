package com.mycompany.acthacelonene.models;

import com.mycompany.acthacelonene.utils.Identifiable;

public class Grupo implements Identifiable{
    
    private Long idGrupo;
    private String nombre;

    public Grupo() {
    }

    public Grupo(String nombre) {
        this.nombre = nombre;
    }

    public Grupo(Long idGrupo, String nombre) {
        this.idGrupo = idGrupo;
        this.nombre = nombre;
    }
@Override
    public Long getId() {
        return idGrupo;
    }

    public String getNombre() {
        return nombre;
    }
@Override
    public void setId(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
