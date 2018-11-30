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
public class Paciente {
    
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;
    //private Telefone telefone;
        
    public Paciente() {
        this.cpf = "";
        this.nome = "";
        this.idade = 0;
    }   
    public Paciente( String cpf, String nome, char sexo, int idade ) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    public Paciente( Paciente a ) {
        this.cpf = a.cpf;
        this.nome = a.nome;
        this.sexo = a.sexo;
        this.idade = a.idade;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
