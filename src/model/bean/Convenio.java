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
public class Convenio {

    private int codigo;
    private String nome;
    private String cobertura;

    public Convenio() {
        this.codigo = 0;
        this.nome = "";
        this.cobertura = "";
    }
    public Convenio(int codigo, String nome, String cobertura) {
        this.codigo = codigo;
        this.nome = nome;
        this.cobertura = cobertura;
    }
    public Convenio(Convenio a) {
        this.codigo = a.codigo;
        this.nome = a.nome;
        this.cobertura = a.cobertura;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCobertura() {
        return cobertura;
    }
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }   
}

