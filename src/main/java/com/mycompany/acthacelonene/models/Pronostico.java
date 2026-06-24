package com.mycompany.acthacelonene.models;

import com.mycompany.acthacelonene.utils.Identifiable;

public class Pronostico implements Identifiable{
    
    private Long idPronostico;
    private Usuario usuario;
    private Partido partido;
    private int golesLocalPronosticado;
    private int golesVisitantePronosticado;
    private int puntajeObtenido;

    public Pronostico() {
    }

    public Pronostico(Usuario usuario, Partido partido, int golesLocalPronosticado, int golesVisitantePronosticado, int puntajeObtenido) {
        this.usuario = usuario;
        this.partido = partido;
        this.golesLocalPronosticado = golesLocalPronosticado;
        this.golesVisitantePronosticado = golesVisitantePronosticado;
        this.puntajeObtenido = puntajeObtenido;
    }

    public Pronostico(Long idPronostico, Usuario usuario, Partido partido, int golesLocalPronosticado, int golesVisitantePronosticado, int puntajeObtenido) {
        this.idPronostico = idPronostico;
        this.usuario = usuario;
        this.partido = partido;
        this.golesLocalPronosticado = golesLocalPronosticado;
        this.golesVisitantePronosticado = golesVisitantePronosticado;
        this.puntajeObtenido = puntajeObtenido;
    }
@Override
    public Long getId() {
        return idPronostico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Partido getPartido() {
        return partido;
    }

    public int getGolesLocalPronosticado() {
        return golesLocalPronosticado;
    }

    public int getGolesVisitantePronosticado() {
        return golesVisitantePronosticado;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }
@Override
    public void setId(Long idPronostico) {
        this.idPronostico = idPronostico;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public void setGolesLocalPronosticado(int golesLocalPronosticado) {
        this.golesLocalPronosticado = golesLocalPronosticado;
    }

    public void setGolesVisitantePronosticado(int golesVisitantePronosticado) {
        this.golesVisitantePronosticado = golesVisitantePronosticado;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }
    
    
    
}
