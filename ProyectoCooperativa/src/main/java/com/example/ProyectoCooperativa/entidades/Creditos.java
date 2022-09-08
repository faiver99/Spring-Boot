package com.example.ProyectoCooperativa.entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Creditos {


    @Id
    private int codigo;
    @Column(nullable = false)
    private int montoPrestado;
    @Column(nullable = false)
    private int plazoPrestado;
    @Column(nullable = false)
    private Date fechaDesembolso;

    @ManyToOne
        @JoinColumn(name="Documento cliente")
        Cliente cli;

    @ManyToOne
         @JoinColumn(name = "codigo linea")
         LineasDeCredito lc;



    public Creditos(int codigo, int montoPrestado, int plazoPrestado, Date fechaDesembolso, Cliente cli, LineasDeCredito lc) {
        this.codigo = codigo;
        this.montoPrestado = montoPrestado;
        this.plazoPrestado = plazoPrestado;
        this.fechaDesembolso = fechaDesembolso;
        this.cli = cli;
        this.lc = lc;
    }

    public Creditos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMontoPrestado() {
        return montoPrestado;
    }

    public void setMontoPrestado(int montoPrestado) {
        this.montoPrestado = montoPrestado;
    }

    public int getPlazoPrestado() {
        return plazoPrestado;
    }

    public void setPlazoPrestado(int plazoPrestado) {
        this.plazoPrestado = plazoPrestado;
    }

    public Date getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(Date fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LineasDeCredito getLc() {
        return lc;
    }

    public void setLc(LineasDeCredito lc) {
        this.lc = lc;
    }
}
