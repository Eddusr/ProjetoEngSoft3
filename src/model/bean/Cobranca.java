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
    private double valor;
    private double parcela;
    private int numparcela;
    private Consulta consulta;
    //private Convenio convenio;

    public Cobranca() {
    }

    public Cobranca(double valor, double parcela, int numparcela, Consulta consulta) {
        this.valor = valor;
        this.parcela = parcela;
        this.numparcela = numparcela;
        this.consulta = consulta;
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
