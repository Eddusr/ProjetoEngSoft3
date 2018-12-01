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
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(String crm, String nome, Especialidade especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    

    public String getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
   
}
