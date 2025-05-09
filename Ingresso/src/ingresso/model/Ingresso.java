/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresso.model;

/**
 *
 * @author gabri
 */
public abstract class Ingresso {
    protected int id;
    protected String nomeEvento;
    protected String dataEvento;
    protected double valorBase;
    private static int proximoId = 1;

    public Ingresso(String nomeEvento, String dataEvento, double valorBase) {
        this.id = proximoId++;
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.valorBase = valorBase;
    }

    public abstract double calcularValor();

    public abstract void imprimirIngresso();

    public int getId() {
        return id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public double getValorBase() {
        return valorBase;
    }

    public static int getProximoId() {
        return proximoId;
    }
    
    
    
}
