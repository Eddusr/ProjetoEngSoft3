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
public class Medico {
    
    private String crm;
    private String nome;
    //private Especialidade especialidade;

    public Medico() {
        this.crm = "";
        this.nome = "";
    }
    public Medico(String crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }
    public Medico(Medico a) {
        this.crm = a.crm;
        this.nome = a.nome;
    }

    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
