/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Eduardo
 */
public class Cobranca {
    
    private int codigo;
    private double parcela;
    private int numparcela;
    //private Convenio convenio;

    public Cobranca() {
        this.codigo = 0;
        this.parcela = 0.0;
        this.numparcela = 0;
    }
    public Cobranca(int codigo, double parcela, int numparcela) {
        this.codigo = codigo;
        this.parcela = parcela;
        this.numparcela = numparcela;
    }
    public Cobranca(Cobranca a) {
        this.codigo = a.codigo;
        this.parcela = a.parcela;
        this.numparcela = a.numparcela;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getParcela() {
        return parcela;
    }
    public void setParcela(double parcela) {
        this.parcela = parcela;
    }
    public int getNumparcela() {
        return numparcela;
    }
    public void setNumparcela(int numparcela) {
        this.numparcela = numparcela;
    }
    
}
