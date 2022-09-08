package com.example.ProyectoCooperativa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LineasDeCredito {
    @Id
    private int codigo;
    @Column(nullable = false, unique = true, length = 30)
    private String nombre;
    @Column
    private int montoMaximo;
    @Column
    private int montoMinino;

    public LineasDeCredito() {
    }

    public LineasDeCredito(int codigo, String nombre, int montoMaximo, int montoMinino) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoMaximo = montoMaximo;
        this.montoMinino = montoMinino;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(int montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getMontoMinino() {
        return montoMinino;
    }

    public void setMontoMinino(int montoMinino) {
        this.montoMinino = montoMinino;
    }
}
