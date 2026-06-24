package com.mycompany.acthacelonene.models;

import com.mycompany.acthacelonene.utils.Identifiable;
import java.time.LocalDate;

public class Partido implements Identifiable {
    
    private Long idPartido;
    private LocalDate fecha;
    private Pais local;
    private Pais visitante;
    private int golesLocal;
    private int golesVisitante;
    private String estado; //no decia que tipo de dato era, le puse string

    public Partido() {
    }

    public Partido(LocalDate fecha, Pais local, Pais visitante, int golesLocal, int golesVisitante, String estado) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.estado = estado;
    }

    public Partido(Long idPartido, LocalDate fecha, Pais local, Pais visitante, int golesLocal, int golesVisitante, String estado) {
        this.idPartido = idPartido;
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.estado = estado;
    }
@Override
    public Long getId() {
        return idPartido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Pais getLocal() {
        return local;
    }

    public Pais getVisitante() {
        return visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public String getEstado() {
        return estado;
    }
@Override
    public void setId(Long idPartido) {
        this.idPartido = idPartido;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setLocal(Pais local) {
        this.local = local;
    }

    public void setVisitante(Pais visitante) {
        this.visitante = visitante;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
